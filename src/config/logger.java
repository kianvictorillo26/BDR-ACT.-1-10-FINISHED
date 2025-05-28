package config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class logger {

    public enum LogLevel {
        INFO,
        WARN,
        ERROR
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static config dbConfig = new config();

    private static String getTimestamp() {
        return sdf.format(new Date());
    }

    // Console logging methods
    public static void info(String message) {
        logToConsole(LogLevel.INFO, message);
    }

    public static void warn(String message) {
        logToConsole(LogLevel.WARN, message);
    }

    public static void error(String message) {
        logToConsole(LogLevel.ERROR, message);
    }

    public static void error(String message, Throwable t) {
        logToConsole(LogLevel.ERROR, message);
        t.printStackTrace(System.err);
    }

    private static void logToConsole(LogLevel level, String message) {
        String logMessage = getTimestamp() + " [" + level.name() + "] " + message;
        if (level == LogLevel.ERROR) {
            System.err.println(logMessage);
        } else {
            System.out.println(logMessage);
        }
    }

    // Generic method to log to database with userId and action and log level
    public static void logToDatabase(Connection con, Integer userId, String action, LogLevel level) {
        boolean createdConnection = false;
        try {
            if (con == null || con.isClosed()) {
                con = dbConfig.getConnection();
                if (con == null || con.isClosed()) {
                    dbConfig = new config();
                    con = dbConfig.getConnection();
                }
                createdConnection = true;
            }

            if (con == null || con.isClosed()) {
                error("Failed to establish database connection for logging");
                return;
            }

            String sql = "INSERT INTO logs (user_id, action, log_level, timestamp) VALUES (?, ?, ?, NOW())";
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                if (userId != null) {
                    pst.setInt(1, userId);
                } else {
                    pst.setNull(1, java.sql.Types.INTEGER);
                }
                pst.setString(2, action);
                pst.setString(3, level.name());

                int rows = pst.executeUpdate();
                if (rows > 0) {
                    info("Successfully logged action to database: " + action + " for user: " + userId);
                } else {
                    error("Failed to insert log entry - no rows affected");
                }
            }
        } catch (SQLException e) {
            error("Failed to log to database: " + e.getMessage(), e);
        } finally {
            if (createdConnection && con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    error("Failed to close logger connection: " + ex.getMessage(), ex);
                }
            }
        }
    }

    // Overloaded method for convenience when no connection is provided
    public static void logToDatabase(Integer userId, String action, LogLevel level) {
        Connection con = null;
        try {
            con = dbConfig.getConnection();
            logToDatabase(con, userId, action, level);
        } catch (Exception e) {
            error("Failed to create connection for logging: " + e.getMessage(), e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    error("Failed to close logger connection: " + ex.getMessage(), ex);
                }
            }
        }
    }

    // Convenience methods for logging with default INFO level to database
    public static void logAction(Integer userId, String action) {
        logToDatabase(userId, action, LogLevel.INFO);
    }

    public static void logAction(String action) {
        logToDatabase(null, action, LogLevel.INFO);
    }

    // Test method to insert a test log entry
    public static void testLog() {
        try {
            config db = new config();
            Connection con = db.getConnection();
            logToDatabase(con, 0, "Test log entry", LogLevel.INFO);
        } catch (Exception e) {
            error("Test log failed: " + e.getMessage(), e);
        }
    }
}

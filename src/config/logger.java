package config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;

public class logger {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static config dbConfig = new config();

    private static String getTimestamp() {
        return sdf.format(new Date());
    }

    public static void info(String message) {
        System.out.println(getTimestamp() + " [INFO] " + message);
    }

    public static void warn(String message) {
        System.out.println(getTimestamp() + " [WARN] " + message);
    }

    public static void error(String message) {
        System.err.println(getTimestamp() + " [ERROR] " + message);
    }

    // Optionally, you can add overloaded methods to log exceptions or throwable stack traces
    public static void error(String message, Throwable t) {
        System.err.println(getTimestamp() + " [ERROR] " + message);
        t.printStackTrace(System.err);
    }

    public static void logToDatabase(int userId, String action) {
        String sql = "INSERT INTO logs (user_id, action, timestamp) VALUES (?, ?, NOW())";
        try {
            dbConfig.insertData(sql, userId, action);
            info("Logged action to database for user_id: " + userId);
        } catch (SQLException e) {
            error("Failed to log action to database: " + e.getMessage(), e);
        }
    }
}

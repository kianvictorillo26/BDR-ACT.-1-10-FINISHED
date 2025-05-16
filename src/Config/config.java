package config;

import java.sql.*;

public class config {
    private Connection connect;

    // Constructor to connect to the database
    public config() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdr", "root", "");
            System.out.println("Connected to the database successfully!");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Insert Data (Uses PreparedStatement for Security)
    public int insertData(String sql, Object... params) throws SQLException {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            return pst.executeUpdate();
        }
    }

    // Retrieve Data Securely
    public ResultSet getData(String sql, Object... params) throws SQLException {
        PreparedStatement stmt = connect.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            stmt.setObject(i + 1, params[i]);
        }
        return stmt.executeQuery();
    }

    // Check if a field exists
    public boolean fieldExists(String tableName, String fieldName, String value) throws SQLException {
        String sql = "SELECT 1 FROM " + tableName + " WHERE " + fieldName + " = ?";
        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, value);
            ResultSet result = pstmt.executeQuery();
            return result.next();
        }
    }

    // Validate login securely with password hashing
    public String validateLogin(String username, String password) throws SQLException {
        String query = "SELECT usertype, password FROM users WHERE username = ?";
        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                String storedHashedPassword = rs.getString("password");
                try {
                    if (passwordHasher.checkPassword(password, storedHashedPassword)) {
                        return rs.getString("usertype"); // Return usertype if password matches
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null; // Return null if login fails
    }

   public void closeConnection() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException ex) {
            System.out.println("Error closing connection: " + ex.getMessage());
        }
    }
    // Update Data
    public int updateData(String sql, Object... params) throws SQLException {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            return pst.executeUpdate();
        }
    }

    // Check for duplicates (excluding current record)
    public boolean duplicateCheckExcludingCurrent(String tableName, String columnName, String value, String idColumn, String idValue) {
        String sql = "SELECT 1 FROM " + tableName + " WHERE " + columnName + " = ? AND " + idColumn + " <> ?";
        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, value);
            pstmt.setString(2, idValue);
            ResultSet result = pstmt.executeQuery();
            return result.next();
        } catch (SQLException ex) {
            System.out.println("Database Error: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    // Get connection for external use
    public Connection getConnection() {
        return connect;
    }
    
    
}

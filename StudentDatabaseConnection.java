package Lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {
    // Requirements: Define connection attribute parameters as constants
    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root"; // Empty for local lab setup

    // Requirements: Static method returning a runtime Connection handler
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
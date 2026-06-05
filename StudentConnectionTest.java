package Lab8;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        // Use try-with-resources to manage stream lifecycles safely
        try (Connection connection = StudentDatabaseConnection.getConnection()) {
            if (connection != null) {
                // Requirements statement validation printout
                System.out.println("Database connected successfully.");
            }
        } catch (SQLException e) {
            // Requirements: Catch exception anomalies and print basic warning message
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
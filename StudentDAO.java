package Lab8;

import Lab8.StudentDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    // Requirements: Method to handle single insertion statements securely
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            // Map fields cleanly to escape injection security risks
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());
            
            statement.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    // Requirements: Access data table row groupings entirely
    public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             java.sql.ResultSet resultSet = statement.executeQuery()) {
            
            System.out.println("--- Registered Student Inventory ---");
            // Pull information segment cycles line-by-line via cursor tracking pointers
            while (resultSet.next()) {
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int mark = resultSet.getInt("mark");
                
                System.out.println("ID: " + id + " | Name: " + name + " | Mark: " + mark);
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    // Requirements: Targeted query verification mapping routine
    public void findStudentById(int studentId) {
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, studentId);
            
            try (java.sql.ResultSet resultSet = statement.executeQuery()) {
                // Evaluation constraint tracking exact positional rows
                if (resultSet.next()) {
                    System.out.println("Student Found -> ID: " + resultSet.getInt("student_id") +
                                       ", Name: " + resultSet.getString("student_name") +
                                       ", Mark: " + resultSet.getInt("mark"));
                } else {
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Requirements: Database element value re-assignment modification execution
    public void updateStudentMark(int studentId, int newMark) {
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, newMark);
            statement.setInt(2, studentId);
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
} // End of complete StudentDAO class definition

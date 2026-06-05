package lab7;

public class StudentAverageCalculator {
    // Requirements: use private for both attributes
    private int totalMarks;
    private int numberOfStudents;

    // Create a constructor to initialize both values 
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Create a method named calculateAverage() that returns an int 
    public int calculateAverage() {
        // Inside calculateAverage(), return: totalMarks / numberOfStudents 
        return totalMarks / numberOfStudents;
    }
}
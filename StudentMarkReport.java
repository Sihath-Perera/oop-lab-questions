package Lab7;

public class StudentMarkReport {
    // Requirements: use private for the array attribute 
    private String[] marks;

    // Create a constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Create a method named getMarkAt(int index) that returns an int
    public int getMarkAt(int index) {
        // Access the mark from the array using the given index
        String selectedMark = marks[index];
        
        // Convert the selected text mark using Integer.parseInt(...) and return 
        return Integer.parseInt(selectedMark);
    }
}
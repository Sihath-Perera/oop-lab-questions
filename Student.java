package Lab8;

public class Student {
    // Requirements: Private encapsulation parameters
    private int studentId;
    private String studentName;
    private int mark;

    // Requirements: Direct field mapping constructor
    public Student(int studentId, String studentName, int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Requirements: Public data extraction encapsulation getters
    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public int getMark() { return mark; }
}
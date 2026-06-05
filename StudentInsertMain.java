package Lab8;

public class StudentInsertMain {
    public static void main(String[] args) {
        // Requirements: Create isolated entity instance configuration definitions
        Student student = new Student(1, "Nimal Perera", 82);
        StudentDAO dao = new StudentDAO();
        
        // Push object parameters into database actions
        dao.addStudent(student);
    }
}
    


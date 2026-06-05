package Lab8;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // Requirements sequential workflow pipeline verification execution
        System.out.println("--- Verification Lookup ---");
        dao.findStudentById(1);
        
        System.out.println("\n--- Performing Target Score Modification ---");
        dao.updateStudentMark(1, 95);
        
        System.out.println("\n--- Post-Modification State State-Check ---");
        dao.findStudentById(1);
    }
}
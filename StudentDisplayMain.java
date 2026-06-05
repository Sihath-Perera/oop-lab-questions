package Lab8;

public class StudentDisplayMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // Pull down catalog matrix
        dao.displayAllStudents();
    }
}
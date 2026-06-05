package Lab7;

public class StudentMarkReportTest {
    public static void main(String[] args) {
        // Create a String array with the specific required values 
        String[] marks = {"78", "82", "absent", "90"};
        
        // Create a StudentMarkReport object
        StudentMarkReport report = new StudentMarkReport(marks);

        // --- Part B: Test an Invalid Array Index --
        try {
            // Index 6 does not exist in an array of size 4
            int mark = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist."); //
        } 
        finally {
            System.out.println("Array access checking completed."); // 
        }

        // --- Part C: Test an Invalid Number Format --- 
        try {
            // Index 2 contains the string text "absent" 
            int mark = report.getMarkAt(2);
            System.out.println("Mark at index 2: " + mark);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number."); // 
        } 
        finally {
            System.out.println("Number conversion checking completed."); // 
        }

        // Final completion message printed after both distinct blocks complete 
        System.out.println("Report checking completed.");
        
        /*
         * Part D: Short Comments
         * * Comment 1: getMarkAt(6) causes an ArrayIndexOutOfBoundsException because the array length 
         * is only 4 (valid indices are 0 to 3. Requesting index 6 attempts to access 
         * a memory boundary outside the array's allocatio.
         * * Comment 2: getMarkAt(2) causes a NumberFormatException because index 2 points to the text 
         * string "absent", which contains alphabetical letters that cannot be compiled or converted 
         * into a base-10 numerical integer structure by Integer.parseInt().
         */
    }
}
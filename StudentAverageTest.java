
package lab7;

public class StudentAverageTest {
    public static void main(String[] args) {
        // Create one StudentAverageCalculator object using 0 as the number of students 
        StudentAverageCalculator calculator = new StudentAverageCalculator(450, 0);

        // Call calculateAverage() inside a try block 
        try {
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } 
        // Catch ArithmeticException 
        catch (ArithmeticException e) {
            // Print a simple error messag
            System.out.println("Error: Number of students cannot be zero.");
        } 
        // Use a finally block to print completion message
        finally {
            System.out.println("Average calculation completed.");
        }

        // After the try-catch-finally block, print continuation message 
        System.out.println("Program continues...");
        
        /* * Part C: Short Comment 
         * Why the exception occurs: An ArithmeticException occurs here because the program 
         * attempts an integer division by zero (totalMarks / 0) inside calculateAverage(), 
         * which is mathematically undefined in integer arithmetic.
         */
    }
}

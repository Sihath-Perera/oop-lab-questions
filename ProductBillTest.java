package Lab7;

public class ProductBillTest {
    public static void main(String[] args) {
        // Create one ProductBill object with valid price and invalid quantity strinG
        ProductBill bill = new ProductBill("1500.00", "two");

        // Call calculateTotal() inside a try blocK
        try {
            double total = bill.calculateTotal();
            System.out.println("Total Bill: LKR " + total);
        } 
        // Catch NumberFormatException
        catch (NumberFormatException e) {
            // Print a simple error message
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        // Use a finally block to print completion message 
        finally {
            System.out.println("Product bill calculation completed.");
        }

        // After the try-catch-finally block, print continuation message 
        System.out.println("Program continues...");

        /* * Part C: Short Comment 
         * Why the exception occurs: A NumberFormatException occurs because Integer.parseInt() 
         * receives the non-numeric string value "two" and cannot convert it into a valid 
         * integer primitive format
        */
    }
}
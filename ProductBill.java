package Lab7;

public class ProductBill {
    // Requirements: use private for both attributes
    private String priceText;
    private String quantityText;

    // Create a constructor to initialize both values
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // Create a method named calculateTotal() that returns a double
    public double calculateTotal() {
        // Convert text inputs to primitive data types [cite: 160]
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        
        return price * quantity; // Return the total calculation 
    }
}
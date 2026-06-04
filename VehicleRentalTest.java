/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab5;

public class VehicleRentalTest {
    public static void main(String[] args) {
        // Polymorphic object creation using Vehicle references
        Vehicle vehicle1 = new Car("WP-CAD-8843", "Toyota", 5, 4500.0);
        Vehicle vehicle2 = new Bike("WP-BCZ-1122", "Yamaha", 12, 150.0);

        System.out.println("--- Processing Car Rental ---");
        vehicle1.displayVehicleInfo();
        double carCost = vehicle1.calculateRentalCost();
        System.out.println("Total Car Rental Cost: LKR " + carCost);

        System.out.println("\n--- Processing Bike Rental ---");
        vehicle2.displayVehicleInfo();
        double bikeCost = vehicle2.calculateRentalCost();
        System.out.println("Total Bike Rental Cost: LKR " + bikeCost);

        /*
         * RUNTIME POLYMORPHISM EXPLANATION:
         * This displays runtime polymorphism (method overriding) because both 'Car' and 'Bike' 
         * offer unique implementations of 'calculateRentalCost()'. Even though both objects are 
         * stored in 'Vehicle' reference variables, Java defers the method decision until execution 
         * time, choosing the method belonging to the actual runtime object type rather than the reference type.
         */
    }
}
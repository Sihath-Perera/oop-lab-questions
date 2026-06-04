/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

class Car extends Vehicle {
    private int numberOfDays;
    private double dailyRate;

    public Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand); // Invoking parent constructor
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost(); // Calling parent method first
        return numberOfDays * dailyRate;
    }
}
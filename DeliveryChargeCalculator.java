package Lab05.Question01;

public class DeliveryChargeCalculator {

    // Fixed rates as constants
    private static final double DISTANCE_RATE = 100.0;
    private static final double WEIGHT_RATE = 50.0;
    private static final double EXPRESS_CHARGE = 500.0;

    // Overload 1: Base charge only
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Overload 2: Base charge + Distance charge
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    // Overload 3: Base charge + Distance charge + Weight charge
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    // Overload 4: Base charge + Express delivery option
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_CHARGE;
        }
        return baseCharge;
    }
}
public class UnitConverter1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371; // Conversion factor
        return km * km2miles;      // Convert and return the result
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934; // Conversion factor
        return miles * miles2km;  // Convert and return the result
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; // Conversion factor
        return meters * meters2feet; // Convert and return the result
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; // Conversion factor
        return feet * feet2meters;  // Convert and return the result
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double km = 5.0;
        double miles = 3.0;
        double meters = 10.0;
        double feet = 30.0;

        System.out.printf("%.2f kilometers is %.2f miles%n", km, convertKmToMiles(km));
        System.out.printf("%.2f miles is %.2f kilometers%n", miles, convertMilesToKm(miles));
        System.out.printf("%.2f meters is %.2f feet%n", meters, convertMetersToFeet(meters));
        System.out.printf("%.2f feet is %.2f meters%n", feet, convertFeetToMeters(feet));
    }
}

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 10.0;

        System.out.printf("%.2f yards is %.2f feet%n", yards, convertYardsToFeet(yards));
        System.out.printf("%.2f feet is %.2f yards%n", feet, convertFeetToYards(feet));
        System.out.printf("%.2f meters is %.2f inches%n", meters, convertMetersToInches(meters));
        System.out.printf("%.2f inches is %.2f meters%n", inches, convertInchesToMeters(inches));
        System.out.printf("%.2f inches is %.2f centimeters%n", inches, convertInchesToCentimeters(inches));
    }
}

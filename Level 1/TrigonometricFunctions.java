import java.util.Scanner;

public class TrigonometricFunctions{
    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the given angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent of the angle in radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner instance named 'input'

        // Prompt the user to input an angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble(); // Input angle in degrees

        // Call the method to calculate trigonometric values
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the calculated sine, cosine, and tangent values
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        input.close(); // Close the Scanner to release resources
    }
}

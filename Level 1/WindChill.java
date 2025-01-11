import java.util.Scanner;

public class WindChill {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temp, double windSpeed) {
        // Wind chill formula:
        // windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt the user to enter temperature and wind speed
        System.out.print("Enter temperature (in Fahrenheit) and wind speed (in mph): ");
        double temp = scanner.nextDouble(); // Input temperature
        double windSpeed = scanner.nextDouble(); // Input wind speed

        // Call the method to calculate wind chill temperature
        double windChill = calculateWindChill(temp, windSpeed);

        // Display the calculated wind chill temperature without formatting
        System.out.println("Wind Chill Temperature: " + windChill);

        scanner.close(); // Close the scanner to release resources
    }
}

import java.util.Scanner;

public class TempConversiontoC {
    public static void main(String[] args) {
	
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner obj
        input.close();
    }
}

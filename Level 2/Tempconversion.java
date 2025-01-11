import java.util.Scanner;

public class Tempconversion {
    public static void main(String[] args) {
	
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        input.close();
    }
}

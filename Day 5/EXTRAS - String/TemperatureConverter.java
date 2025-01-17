import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter 1 for F to C, 2 for C to F: ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.println(temperature + " Fahrenheit is " + fahrenheitToCelsius(temperature) + " Celsius.");
        } else if (choice == 2) {
            System.out.println(temperature + " Celsius is " + celsiusToFahrenheit(temperature) + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice! Enter 1 or 2.");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

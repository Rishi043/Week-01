
// Creating a class named CalculatorSwitch
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
		
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Input for the first number
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        // Input for the second number
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        // Input for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();

        // Switch case to perform arithmetic operations
        switch (op) {
            case "+":
                // Performing addition
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // Performing subtraction
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // Performing multiplication
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Performing division
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // Handling invalid operator
                System.out.println("Invalid Operator. Please use +, -, *, or /.");
                break;
        }

        // Closing the Scanner object 
        input.close();
    }
}


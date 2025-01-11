import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the entered number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;  // Exit if the number is negative
        }

        // Initialize the factorial variable to 1 (as the factorial of 0 is 1)
        int factorial = 1;

        // Use a for loop to compute the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply current factorial value by i
        }

        // Print the factorial result
        System.out.println("The factorial of " + number + " is " + factorial);
        
        input.close();
    }
}

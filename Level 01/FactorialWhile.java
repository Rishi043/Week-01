import java.util.Scanner;

public class FactorialWhile {
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

        // Use a while loop to compute the factorial
        int i = 1;
        while (i <= number) {
            factorial *= i;  // Multiply current factorial value by i
            i++;  // Increment i by 1
        }

        // Print the factorial result
        System.out.println("The factorial of " + number + " is " + factorial);
        
        input.close();
    }
}

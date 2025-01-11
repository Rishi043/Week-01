import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // Base case: Sum of first natural number is 1
        }
        return n + recursiveSum(n - 1); // Recursive step: Add n to sum of (n-1) numbers
    }

    // Method to calculate the sum of n natural numbers using the formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2; // Formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter a natural number: ");
        int n = input.nextInt(); // Read user input

        // Check if the input is a natural number (n > 0)
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0).");
            input.close();
            return; // Exit the program if input is not valid
        }

        // Calculate sum using recursion
        int recursiveResult = recursiveSum(n);

        // Calculate sum using the formula
        int formulaResult = formulaSum(n);

        // Display results
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);

        // Compare results and print verification
        if (recursiveResult == formulaResult) {
            System.out.println("Both methods yield the same result: " + recursiveResult);
        } else {
            System.out.println("The results do not match. Something went wrong!");
        }

        input.close(); // Close the scanner
    }
}

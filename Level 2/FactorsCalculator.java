import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int num) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Store factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors; // Return the array of factors
    }

    // Method to calculate the sum of the factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor; // Add each factor to the sum
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor; // Multiply each factor
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static int sumSquareFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Add square of each factor to the sum
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter a number: "); // Prompt user for input
        int num = input.nextInt(); // Read user input

        // Find the factors of the number
        int[] factors = findFactors(num);

        // Display the factors
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum of factors
        System.out.println("Sum of Factors: " + sumFactors(factors));

        // Calculate and display the product of factors
        System.out.println("Product of Factors: " + productFactors(factors));

        // Calculate and display the sum of squares of factors
        System.out.println("Sum of Squares of Factors: " + sumSquareFactors(factors));

        input.close(); // Close the scanner
    }
}

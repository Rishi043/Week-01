
import java.util.Scanner;

public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter a natural number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if it's a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number is not a natural number.");
			
            return;  // Exit if it's not a natural number
        }

        // Compute the sum using the formula: n * (n + 1) / 2
        int formulaSum = n * (n + 1) / 2;

        // Compute the sum using the while loop
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        // Print both sums and compare
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);

        if (formulaSum == loopSum) {
            System.out.println("Both methods give the same result!");
        }

        input.close();
    }
}



// Creating Class with name SumOfNumbers to calculate the sum of numbers until user enters 0

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable to store the total sum, initialized to 0.0
        double total = 0.0;
        
        // Create a variable to store the user-entered number
        double number;

        // Ask the user to enter numbers and continue until they enter 0
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            number = input.nextDouble();  // Read the user input
            
            // If the number is not 0, add it to the total
            if (number != 0) {
                total += number;
            }
            
        } while (number != 0);  // Continue the loop until the user enters 0

        // Print the total sum when the loop ends
        System.out.println("The total sum of the numbers is: " + total);
        
        // Close the scanner object
        input.close();
    }
}


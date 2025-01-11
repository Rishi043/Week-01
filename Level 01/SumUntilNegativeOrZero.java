
// Creating Class with name SumUntilNegativeOrZero to calculate the sum until the user enters 0 or a negative number

import java.util.Scanner;

public class SumUntilNegativeOrZero {
    public static void main(String args[]) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable to store the total sum, initialized to 0.0
        double total = 0.0;
        
        // Start an infinite loop
        while (true) {
            // Ask the user to enter a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = input.nextDouble();  // Read the user input
            
            // Check if the user entered 0 or a negative number, and if so, break the loop
            if (number <= 0) {
                break;  // Exit the loop if the number is 0 or negative
            }
            
            // Add the user-entered number to the total if it's positive
            total += number;
        }

        // Print the total sum when the loop ends
        System.out.println("The total sum of the numbers is: " + total);
        
        // Close the scanner object
        input.close();
    }
}




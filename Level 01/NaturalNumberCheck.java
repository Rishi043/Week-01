// Creating Class to check if the number is a natural number 
import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String args[]){   

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // enter a number
        System.out.println("Enter a number: ");
		
        // Take input for the number
        int number = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number >= 0) {
            // Calculate the sum of n natural numbers using the formula n * (n + 1) / 2
            int sum = (number * (number + 1)) / 2;

            // Display the sum of natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } 
		else
		{
            // Display if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner object
        input.close();
    }
}

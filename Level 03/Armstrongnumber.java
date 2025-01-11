
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
		
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Save the original number 
        int originalNumber = number;
        int result = 0;

        // Calculate the number of digits
        int digits = String.valueOf(number).length();

        // Loop through each digit and calculate the sum of digits raised to the power of 'digits'
        while (number > 0) 
		{
            int digit = number % 10; // Get the last digit
            result += Math.pow(digit, digits); // Add digit^digits to the result
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner object
        input.close();
    }
}


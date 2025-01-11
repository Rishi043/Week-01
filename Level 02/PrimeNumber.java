
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        // Initialize isPrime variable to true, assuming the number is prime
        boolean isPrime = true;

        // Loop through all numbers from 2 to the number 
		
        for (int i = 2; i < number; i++)
		{
            // If the number is divisible by any number, it's not prime
            if (number % i == 0) {
                isPrime = false;  // Set isPrime to false if divisible
                break;  // Break the loop as we found that it's not a prime
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();  // Close the scanner object
    }
}


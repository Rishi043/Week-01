
import java.util.Scanner;

public class FizzBuzzIf {

    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Asking the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If the number is not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
            }
        }
        
        // Close the scanner object
        input.close();
    }
}


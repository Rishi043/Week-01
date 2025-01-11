import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        //  enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the counter variable
            int i = 1;

            // Using a while loop to iterate from 1 to the input number
            while (i <= number) {
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

                // Increment the counter variable
                i++;
            }
        }
        
        // Close the scanner object
        input.close();
    }
}

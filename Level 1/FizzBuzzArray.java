// Creating Class with name FizzBuzzArray to implement the FizzBuzz logic
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
	
        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the number is a positive integer
        if (number <= 0) 
		{
            System.out.println("Please enter a positive integer.");
        } 
		else 
		{
            // Creating a String array to save the results
            String[] results = new String[number + 1];

            // Looping from 0 to the entered number to generate FizzBuzz results
            for (int i = 0; i <= number; i++) 
			{
                if (i % 3 == 0 && i % 5 == 0) 
				{
                    results[i] = "FizzBuzz"; // Multiple of both 3 and 5
                } 
				else if (i % 3 == 0) 
				{
                    results[i] = "Fizz"; // Multiple of 3
                } 
				else if (i % 5 == 0) 
				{
                    results[i] = "Buzz"; // Multiple of 5
                } 
				else 
				{
                    results[i] = String.valueOf(i);          // Just, saving the number
                }
            }

            // Looping again to print the results with the "format Position"
            for (int i = 0; i <= number; i++)  
			{
                System.out.println("Position " + i + " = " + results[i]);
            }
        }

        // Closing the input object
        input.close();
    }
}

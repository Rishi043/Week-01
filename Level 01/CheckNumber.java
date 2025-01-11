
// Creating Class with name CheckNumber to determine if a number is positive, negative, or zero

import java.util.Scanner;

public class CheckNumber {
    public static void main(String args[]){  
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // enter a number
        System.out.println("Enter a number: ");
        
        // Take the number as input
        int number = input.nextInt(); 
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than 0, it's positive
            System.out.println("The number is positive.");
			
        } 
		else if (number < 0) 
		{
            // If the number is less than 0, it's negative
            System.out.println("The number is negative.");
        } 
		else 
		{
            // If the number is exactly 0, it's zero
            System.out.println("The number is zero.");
        }
        
        // Close the scanner object
        input.close();
    }
}


/* import java.util.Scanner;

public class IllegalArgumentExceptionCode{

    public static void generateException(String input) {              // Method to generate the Exception
        System.out.println("Generating Exception:"); 
		
        // Start index is greater than the end index, causing an IllegalArgumentException 
		
        System.out.println(input.substring(5, 3));
    }

    public static void handleException(String input) {             // Method to handle the Exception
        System.out.println("Handling Exception:");
        try 
		{
            // Start index is greater than the end index
            System.out.println(input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } 
    }
	
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } 
		catch (IllegalArgumentException e) 
		{
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
	
	
	
	------------------------- GIVES StringIndexOutOfBounds EXCEPTION
}
*/

import java.util.Scanner;

public class IllegalArgumentExceptionCode {

    public static void generateException(String input) {              // Method to generate the Exception
        System.out.println("Generating Exception:");
        
        // Check if start index is greater than end index
        if (5 > 3) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        
        // If the indices are valid, this will not be executed, but just to demonstrate substring method
        System.out.println(input.substring(5, 3));
    }

    public static void handleException(String input) {             // Method to handle the Exception
        System.out.println("Handling Exception:");
        try {
            // Check if start index is greater than end index
            if (5 > 3) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println(input.substring(5, 3));  // This line would cause StringIndexOutOfBoundsException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } 
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}

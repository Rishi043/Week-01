import java.util.Scanner;

public class StringIndexOutOfBoundCode {

    // Method to generate the Exception
    public static void generateException(String input) 
	{
        System.out.println("Generating Exception:");
       
        System.out.println(input.charAt(input.length() + 1));           // Access an invalid index to throw the exception
    }

    // Method to handle the Exception
    public static void handleException(String input) {
        System.out.println("Handling Exception:");
        try {
            // Access an invalid index to attempt throwing the exception
            System.out.println(input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          // making the Scannerclass object

        System.out.print("Enter a string: ");             // Take user input for the string
        String userInput = scanner.nextLine();

        try                                                 
		{                                                
            generateException(userInput);                 // Calling the method to generate the exception
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}

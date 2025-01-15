import java.util.Scanner;

public class NumberFormatExceptionCode {

    public static void generateException(String text)   // Method to generate the NumberFormatException
	{
        System.out.println("Generating Exception:"); 
		
        // Attempt to convert the input string to an integer (will throw NumberFormatException if not a valid number)
        int num = Integer.parseInt(text); 
        System.out.println("Converted number: " + num);
    }
	

    // Method to handle the NumberFormatException
    public static void handleException(String text) 
	{
        System.out.println("Handling Exception:");
        try 
		{
            // Attempt to convert the input string to an integer 
			
            int num = Integer.parseInt(text);  // This will throw NumberFormatException if the text is not a number 
			
            System.out.println("Converted number: " + num);
			
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("NumberFormatException caught: " + e.getMessage());  // Handling the exception
        } 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to a number: ");     // Take input from the user 
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try 
		{
            generateException(userInput);  // This will generate the exception
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);  // This will handle the exception with try-catch

        scanner.close();
    }
}





import java.util.Scanner;

public class ArrayIndexOutOfBoundCode {

    public static void generateException(String[] names)      // Method to generate the ArrayIndexOutOfBoundsException 
	{ 
        System.out.println("Generating Exception:"); 
		
        // index larger than the length of the array (out of bounds)
        System.out.println(names[5]);  // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleException(String[] names)       // Method to handle the ArrayIndexOutOfBoundsException
	{
        System.out.println("Handling Exception:");
        try 
		{
            System.out.println(names[5]);                             // This will throw ArrayIndexOutOfBoundsException
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } 
		catch (RuntimeException e) 
		{
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input

        String[] names = new String[n];

        // Taking user input for each name
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the exception
        try {
            generateException(names);  // This will generate the exception if index 5 is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);  // This will handle the exception with try-catch

        scanner.close();
    }
}

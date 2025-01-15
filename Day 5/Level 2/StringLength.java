import java.util.Scanner;

// Creating Class with name StringLength to find and return the length of a string
public class StringLength{
    
    // Creating Method with name getStringLength to calculate string length without length() method
    public static int getStringLength(String str) {
        int count = 0; // Initializing counter to zero
        try {
            while (true) {
                str.charAt(count); // Attempting to access each character in the string
                count++; // Incrementing counter for each character
            }
        } catch (IndexOutOfBoundsException e) {
            // Handling exception when index exceeds the string length
        }
        return count; // Returning the total count as the string length
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a string: ");
        String input = scanner.next(); // Taking input string from user

        // Calling user-defined method to find string length
        int calculatedLength = getStringLength(input);

        // Calling built-in length() method to verify
        int actualLength = input.length();

        // Displaying results
        System.out.println("Calculated length (without length() method): " + calculatedLength);
        System.out.println("Actual length (using length() method): " + actualLength);

        scanner.close(); // Closing the scanner
    }
}

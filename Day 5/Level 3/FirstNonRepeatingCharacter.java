import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store frequency of characters
        int[] charFrequency = new int[256]; // 256 to cover all ASCII characters

        // Calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return a placeholder if no non-repeating character is found
        return 0; // Null character as a placeholder
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display the result
        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Close the scanner
        scanner.close();
    }
}

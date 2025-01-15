import java.util.Scanner;

public class CharacterFrequencyLoop {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequencies(String text) {
        // Convert the input text to a character array
        char[] characters = text.toCharArray();

        // Array to store the frequency of each character
        int[] frequencies = new int[characters.length];

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i]; // Get the current character

            // Skip characters that are already marked as processed or spaces
            if (currentChar == '0' || currentChar == ' ') {
                continue; // Move to the next character
            }

            // Initialize the frequency count for the current character
            frequencies[i] = 1;

            // Inner loop to find duplicate characters
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[j] == currentChar) { // If a duplicate character is found
                    frequencies[i]++; // Increment the frequency count for currentChar
                    characters[j] = '0'; // Mark the duplicate character as '0' to avoid recounting
                }
            }
        }

        // Count the number of unique characters to create a result array
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0' && c != ' ') {
                uniqueCount++; // Count all characters that are not marked as '0' or space
            }
        }

        // Create a String array to store unique characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        // Populate the result array with unique characters and their frequencies
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0' && characters[i] != ' ') { // Only process characters that are not '0' or spaces
                result[index] = characters[i] + " - " + frequencies[i]; // Format as "character - frequency"
                index++; // Move to the next index in the result array
            }
        }

        // Return the result array containing unique characters and their frequencies
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine(); // Read the input string

        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry); // Print each unique character with its frequency
        }

        // Close the Scanner object
        scanner.close();
    }
}

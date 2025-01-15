import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        // Use StringBuilder to store unique characters
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the current character
            boolean isUnique = true; // Flag to check if the character is unique

            // Check if the character already exists in the uniqueChars
            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) { // If character exists, it's not unique
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }

        // Convert the StringBuilder to a char array and return it
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters using unique characters
    public static String[][] findCharacterFrequencies(String text) {
        // Call the method to get the array of unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        // Each row will have two columns: [character, frequency]
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters to calculate their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i]; // Get the current unique character
            int frequency = 0; // Initialize frequency counter

            // Loop through the input string to count occurrences of currentChar
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) { // If characters match, increment the counter
                    frequency++;
                }
            }

            // Store the character and its frequency in the result array
            result[i][0] = String.valueOf(currentChar); // Convert character to String for storage
            result[i][1] = String.valueOf(frequency);  // Store the frequency as a String
        }

        // Return the result array containing characters and their frequencies
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

		String text = scanner.nextLine().trim(); // Trim spaces from input


        // Call the method to find character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String[] entry : frequencies) {
            // Each entry contains the character and its frequency
            System.out.println(entry[0] + " - " + entry[1]);
        }

        // Close the Scanner object 
        scanner.close();
    }
}

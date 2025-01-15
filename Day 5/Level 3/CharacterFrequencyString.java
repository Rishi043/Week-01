import java.util.Scanner;

public class CharacterFrequencyString {

    // Method to find the frequency of characters in a string 
    public static int[][] findCharacterFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of each character (ASCII range 0-255)
        boolean[] isProcessed = new boolean[256]; // Array to check if a character is already added to the result

        // Calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Count unique characters in order of their first occurrence
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!isProcessed[currentChar]) {
                isProcessed[currentChar] = true;
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (isProcessed[currentChar]) {
                result[index][0] = currentChar; // Store the character's ASCII value
                result[index][1] = charFrequency[currentChar]; // Store its frequency
                isProcessed[currentChar] = false; // Mark character as processed
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine().trim(); // Trim spaces from input

        // Call the method to find character frequencies
        int[][] frequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (int[] entry : frequencies) {
            char character = (char) entry[0];
            int frequency = entry[1];
            System.out.println(character + " - " + frequency);
        }

        // Close the scanner object
        scanner.close();
    }
}

import java.util.Scanner;

// Creating Class with name WordLength to split text into words and return them with lengths
public class WordLength {

    // Creating Method with name getStringLength to calculate string length without length() method
    public static int getStringLength(String str) {
        int count = 0; // Initializing counter to zero
        try {
            while (true) {
                str.charAt(count); // Accessing each character
                count++; // Incrementing counter for each character
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count; // Returning the total count
    }

    // Creating Method with name splitText to split a string into words without split() method
    public static String[] splitText(String text) {
        int textLength = getStringLength(text); // Getting length of the string
        int spaceCount = 0; // Counter for spaces

        // Counting spaces to determine the number of words
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Creating an array to store indexes of spaces
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;

        // Storing indexes of spaces
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[spaceCount] = textLength; // Adding the end of the string as the last index

        // Creating an array to store words
        String[] words = new String[spaceCount + 1];
        int start = 0;

        // Extracting words using space indexes
        for (int i = 0; i <= spaceCount; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1; // Moving to the next word
        }
        return words; // Returning the array of words
    }

    // Creating Method with name getWordsWithLengths to return words and their lengths in a 2D array
    public static String[][] getWordsWithLengths(String[] words) {
        int wordCount = getStringLength(words); // Getting the number of words
        String[][] wordLengthArray = new String[wordCount][2]; // Creating 2D array

        // Populating the 2D array with words and their lengths
        for (int i = 0; i < wordCount; i++) {
            wordLengthArray[i][0] = words[i]; // Storing the word
            wordLengthArray[i][1] = String.valueOf(getStringLength(words[i])); // Storing the length as String
        }
        return wordLengthArray; // Returning the 2D array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine(); // Taking input text from user

        // Splitting text into words using the custom method
        String[] words = splitText(inputText);

        // Getting words and their lengths in a 2D array
        String[][] wordLengthArray = getWordsWithLengths(words);

        // Displaying results in a tabular format
        System.out.println("\nWord\tLength");
        for (String[] entry : wordLengthArray) {
            // Converting length from String to Integer for display
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }

        scanner.close(); // Closing the scanner
    }
}

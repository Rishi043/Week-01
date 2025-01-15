import java.util.Scanner;

// Creating Class with name ShortLongString to find shortest and longest strings in text
public class ShortLongString {

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

    // Creating Method with name findShortestAndLongest to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] entry : wordLengthArray) {
            int length = Integer.parseInt(entry[1]); // Converting length from String to Integer
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = entry[0];
            }
            if (length > longestLength) {
                longestLength = length;
                longestWord = entry[0];
            }
        }
        return new String[] { shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength) };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine(); // Taking input text from user

        // Splitting text into words using the custom method
        String[] words = splitText(inputText);

        // Getting words and their lengths in a 2D array
        String[][] wordLengthArray = getWordsWithLengths(words);

        // Finding the shortest and longest words
        String[] result = findShortestAndLongest(wordLengthArray);

        // Displaying the results
        System.out.println("\nShortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word: " + result[2] + " (Length: " + result[3] + ")");

        scanner.close(); // Closing the scanner
    }
}

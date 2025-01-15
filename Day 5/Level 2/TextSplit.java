import java.util.Scanner;

// Creating Class with name TextSplit to split text into words and compare results 

public class TextSplit{

    // Creating Method with name getStringLength to calculate string length without length() method
    public static int getStringLength(String str) {
        int count = 0; // Initializing counter to zero
        try {
            while (true) {
                str.charAt(count); // Attempting to access each character
                count++; // Incrementing counter for each character
            }
        } catch (IndexOutOfBoundsException e) {
            // Handling exception when index exceeds string length
        }
        return count; // Returning the total count
    }

    // Creating Method with name splitText to split a string into words without split() method
    public static String[] splitText(String text) {
        int textLength = getStringLength(text); // Getting length of the string
        int spaceCount = 0; // Counter for spaces

        // Counting the number of spaces
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

    // Creating Method with name compareArrays to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false; // Returning false if lengths are not equal
        }

        // Comparing each element in both arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Returning false if any element does not match
            }
        }
        return true; // Returning true if all elements match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine(); // Taking input text from user

        // Splitting text using custom method
        String[] customSplit = splitText(inputText);

        // Splitting text using built-in split() method
        String[] builtInSplit = inputText.split(" ");

        // Comparing the results
        boolean isEqual = compareArrays(customSplit, builtInSplit);

        // Displaying results
        System.out.println("Custom Split Result: " + String.join(", ", customSplit));
        System.out.println("Built-in Split Result: " + String.join(", ", builtInSplit));
        System.out.println("Are the results equal? " + isEqual);

        scanner.close(); // Closing the scanner
    }
}

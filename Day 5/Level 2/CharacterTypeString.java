import java.util.Scanner;

// Creating Class with name CharacterTypeString to classify and display character types
public class CharacterTypeString {

    // Creating Method with name checkCharacterType to classify a character as Vowel, Consonant, or Not a Letter
    public static String checkCharacterType(char ch) {
        // Converting character to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Converting to lowercase
        }

        // Checking if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Checking if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // If not a letter
        return "Not a Letter";
    }

    // Creating Method with name findCharacterTypes to analyze each character in a string
    public static String[][] findCharacterTypes(String str) {
        int length = getStringLength(str); // Getting the length of the string
        String[][] characterTypeArray = new String[length][2]; // Creating a 2D array for character types

        // Iterating through the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i); // Accessing each character
            characterTypeArray[i][0] = String.valueOf(ch); // Storing the character as String
            characterTypeArray[i][1] = checkCharacterType(ch); // Storing its type
        }

        return characterTypeArray; // Returning the 2D array
    }

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

    // Creating Method with name displayCharacterTypes to print the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypeArray) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");
        for (String[] entry : characterTypeArray) {
            System.out.println(entry[0] + "\t\t" + entry[1]); // Displaying character and its type
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Taking input string from user

        // Analyzing characters in the string
        String[][] characterTypeArray = findCharacterTypes(input);

        // Displaying the character types
        displayCharacterTypes(characterTypeArray);

        scanner.close(); // Closing the scanner
    }
}

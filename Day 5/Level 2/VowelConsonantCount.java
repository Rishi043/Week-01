import java.util.Scanner;

// Creating Class with name VowelConsonantCount to count vowels and consonants in a string
public class VowelConsonantCount {

    // Creating Method with name checkCharacterType to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Converting character to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
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

    // Creating Method with name countVowelsAndConsonants to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0; // Counter for vowels
        int consonants = 0; // Counter for consonants

        int length = getStringLength(str); // Finding the string length

        // Iterating through the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i); // Accessing each character
            String type = checkCharacterType(ch); // Checking character type
            if (type.equals("Vowel")) {
                vowels++; // Incrementing vowel count
            } else if (type.equals("Consonant")) {
                consonants++; // Incrementing consonant count
            }
        }

        // Returning an array with counts of vowels and consonants
        return new int[] { vowels, consonants };
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Taking input string from user

        // Calling the method to count vowels and consonants
        int[] result = countVowelsAndConsonants(input);

        // Displaying the results
        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);

        scanner.close(); // Closing the scanner
    }
}

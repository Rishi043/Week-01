// Creating Class with name ReturnAllChar to implement the required functionality
import java.util.Scanner;

public class ReturnAllChar {

    // Creating Method with name getCharacters to return characters of a string
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()]; // Creating the char[] array
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i); // Assigning the character at index i
        }
        return characters; // Returning the characters array
    }

    // Creating Method "compareArrays" to compare two char arrays and return a boolean result
    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {                 // Checking the elements
                return false;
            }
        }
        return true;
    }

    // Creating the main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take user input

        System.out.print("Enter a string: ");
        String userInput = sc.next(); // Taking string input from the user

        // Calling getCharacters() user-defined method
        char[] userDefinedChars = getCharacters(userInput);

        // Using built-in toCharArray() method
        char[] builtInChars = userInput.toCharArray();

        // Comparing the two arrays
        boolean isEqual = compareArrays(userDefinedChars, builtInChars);

        // Displaying the results
        System.out.println("Characters using user-defined method: " + String.valueOf(userDefinedChars));          // used to convert the char[] into string 
        System.out.println("Characters using built-in toCharArray() method: " + String.valueOf(builtInChars));
        System.out.println("Are the two arrays equal? " + isEqual);

        // Closing the Scanner object
        sc.close();
    }
}

import java.util.Scanner;

public class AnagramString {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {

        if (text1.length() != text2.length())             //  Check if lengths of both texts are equal
		{
            return false;  // Different lengths can't be anagrams
        }


        int[] charCount = new int[256];             // Create an array to store the frequency of characters in the first text


        for (int i = 0; i < text1.length(); i++) {
            charCount[text1.charAt(i)]++;               // Count characters in the first text
        }


        for (int i = 0; i < text2.length(); i++) 
		{
            charCount[text2.charAt(i)]--;              // Count characters in the second text and subtract from the count
        }


        for (int count : charCount) {                   // Check if all counts are zero to make a anagram
            if (count != 0) 
			{ 
                return false;  // If count is not zero, they are not anagrams
            }
        }

        return true;  // If all counts are zero, the texts are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from user
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine(); 
		
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        System.out.println("Are the texts anagrams? " + result);

        scanner.close();  // Close the scanner object
    }
}

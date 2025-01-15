import java.util.Scanner;

public class PalindromeCheck3Ways {

    // Logic 1: Iterative method to check if the string is a palindrome
	
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    // Logic 2: Recursive method to check if the string is a palindrome
	
    public static boolean isPalindromeRecursive(String input, int left, int right) {
        if (left >= right) 
		{
            return true; // Base case: indices cross each other, palindrome is valid
        }
        if (input.charAt(left) != input.charAt(right)) 
		{
            return false;                        // Characters at start and end do not match
        }
        return isPalindromeRecursive(input, left + 1, right - 1); // Recurse with next indices
    }

    // Logic 3: Method using character arrays to check if the string is a palindrome 
	
    public static boolean isPalindromeUsingCharArray(String input) {
		
        char[] charArray = input.toCharArray();                       // Convert string to character array
        char[] reversedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];       // Reverse the array (Imp step)
        }

        return new String(charArray).equals(new String(reversedArray));      // Compare original and reversed arrays
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Logic 1: Palindrome check using Iterative method 
        boolean result1 = isPalindrome(text);
        System.out.println("Is palindrome (Iterative method)? " + result1);

        // Logic 2: Palindrome check using Recursive method 
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Is palindrome (Recursive method)? " + result2);

        // Logic 3: Palindrome check using character arrays
        boolean result3 = isPalindromeUsingCharArray(text);
        System.out.println("Is palindrome (Using char array)? " + result3);

        scanner.close();    // closing the scanner object
    }
}

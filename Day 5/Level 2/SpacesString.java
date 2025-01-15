public class SpacesString {

    // Method to trim leading and trailing spaces using charAt() method
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop to find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();

        // Append characters within the specified range
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Input string with leading and trailing spaces
        String input = "   Hello World!   ";

        // Finding the trim indices
        int[] trimIndices = findTrimIndices(input);
        int start = trimIndices[0];
        int end = trimIndices[1];

        // Trimming spaces using custom methods
        String trimmedCustom = createSubstring(input, start, end);

        // Trimming spaces using built-in trim() method
        String trimmedBuiltIn = input.trim();

        // Comparing both trimmed strings
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Displaying results
        System.out.println("Original String: [" + input + "]");
        System.out.println("Trimmed using custom method: [" + trimmedCustom + "]");
        System.out.println("Trimmed using built-in method: [" + trimmedBuiltIn + "]");
        System.out.println("Are both methods equivalent? " + areEqual);
    }
}

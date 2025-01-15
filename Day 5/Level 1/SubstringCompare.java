import java.util.Scanner;

public class SubstringCompare { 

    // Method to create a substring using charAt() method 
	
    public static String createSubstring(String text, int start, int end) 
	{
        StringBuilder substring = new StringBuilder();     // String Substring = "";
		
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare the "results" using charAt() method 
	
    public static boolean compareStringsCharAt(String str1, String str2) 
	{
        if (str1.length() != str2.length()) {       // If lengths differ, strings are not equal
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {    // Compare each character
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the string: ");
        String text = sc.next(); 
		
        System.out.print("Enter the start index: ");
        int start = sc.nextInt(); 
		
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        if (start < 0 || end > text.length() || start >= end) {     // Validating input indices
            System.out.println("Invalid indices!");
            return;
        }

        String customSubstring = createSubstring(text, start, end);       // calling the method createSubstring()

        String builtInSubstring = text.substring(start, end);             // using built-in substring() method

        // Comparing the two substrings using charAt() comparison method
        boolean comparisonResult = compareStringsCharAt(customSubstring, builtInSubstring);    // calling the method

        // Displaying results
        System.out.println("Result using charAt(): " + customSubstring);
        System.out.println("Result using Built-in substring(): " + builtInSubstring);
        System.out.println("Comparison result is: " + comparisonResult);

    }
}

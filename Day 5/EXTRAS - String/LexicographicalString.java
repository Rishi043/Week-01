import java.util.Scanner;

public class LexicographicalString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();  // First input string
        
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();  // Second input string
        
        int result = simpleCompare(str1, str2);  // Call the comparison method
        
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("The strings are equal");
        }
    }
    
    // Simplified method to compare two strings lexicographically 
	
    public static int simpleCompare(String str1, String str2) 
	{
        int minLength = Math.min(str1.length(), str2.length());  // Find the minimum length
        
        for (int i = 0; i < minLength; i++) 
		{
            if (str1.charAt(i) < str2.charAt(i)) 
			{
                return -1;  // str1 is lexicographically smaller
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;  // str1 is lexicographically larger
            }
        }
        
        // If all compared characters are equal, check string lengths
        if (str1.length() < str2.length()) 
		{
            return -1;  // str1 is lexicographically smaller
        } 
		else if (str1.length() > str2.length()) 
		{
            return 1;  // str1 is lexicographically larger
        }
        
        return 0;  // Both strings are equal
    }
}

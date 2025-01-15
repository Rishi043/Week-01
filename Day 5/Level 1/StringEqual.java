import java.util.Scanner;

public class StringEqual {
	
	// Method to compare two strings using charAt() method
	
	public static boolean compare(String str1, String str2){
		if (str1.length() != str2.length()){                      // If the lengths are not the same, strings are not equal
			return false;
		}
		
		for (int i=0;i<str1.length(); i+=1){
			if (str1.charAt(i) != str2.charAt(i)){                // Compare each character of both strings
				return false;
			}
		}
		return true;   // all characters matched
	} 
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");        // Taking user input for two strings
		String str1 = input.next(); 
		
		System.out.print("Enter the second string: "); 
		String str2 = input.next(); 
		
		boolean result = compare(str1, str2);               // calling the method compare()
		
		boolean equalfunc = str1.equals(str2);             // Compare strings using the built-in equals() method
		
		// Display results
        System.out.println("Result of charAt() method: " + result);
        System.out.println("Result of equals() method: " + equalfunc);
    }
}

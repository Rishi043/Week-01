import java.util.Scanner; 

public class TextToUppercase{                                     // Creating Class "TextToUppercase" to convert text and compare strings
    public static boolean compare(String str1, String str2)
	{ 
	if (str1.length() != str2.length()){        // Check if the lengths are equal
	return false; 
	} 
	for (int i=0;i<str1.length();i+=1){           // Compare each character
	
	if (str1.charAt(i) != str2.charAt(i))         // "charAt (i) is correct" charAt[i] is not
	{
	return false; 
	} 
	} 
	return true; 
	} 
	
    public static String convertToUpperCase(String input) {         // taking string as a parameter 
	
        StringBuilder result = new StringBuilder();                        // to convert char elements into string 

        for (int i = 0; i < input.length(); i++) {
			
            char ch = input.charAt(i);                              // Checking every character one by one from the string 

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') 
			{
                // Convert to uppercase by subtracting 32
                result.append((char)(ch - 32));                       // in result, append the upper case character    " char is a datatype " 
            } 
			else 
			{
                result.append(ch);                   // Append the character as it is if not a lowercase letter
            }
        }
        return result.toString();                             //  converting into string 
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);          // Creating Scanner object to take user input

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();             // taking the complete line as input that's why use nextLine() 


        String builtInUpperCase = userInput.toUpperCase();                   // using the built-in method

      
        String customUpperCase = convertToUpperCase(userInput);             // using the user-defined method

        // Compare the two uppercase strings using the user-defined method
        boolean areEqual = compare(builtInUpperCase, customUpperCase);

        // Display the results
        System.out.println("Result using built-in method: " + builtInUpperCase);
        System.out.println("Result using custom method: " + customUpperCase); 
		
        System.out.println("Are both methods producing the same result? " + areEqual);

        // Close the scanner object
        scanner.close();
    }
}
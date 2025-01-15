import java.util.Scanner;

public class TextToWords {               // Creating class TextToWords to handle splitting text and displaying words with lengths

    // Creating method splitIntoWords to split text into words without using split() 
	
    public static String[] splitIntoWords(String text) {        // string array  
	
        StringBuilder word = new StringBuilder();
        StringBuilder allWords = new StringBuilder();

        for (int i = 0; i < getStringLength(text); i++) {        // calling the getStringLength function 
            char ch = text.charAt(i);
            if (ch == ' ') 
			{
                if (word.length() > 0) 
				{
                    allWords.append(word).append(",");      // Clear the current word
                    word.setLength(0); 
                }
            } 
			else 
			{
                word.append(ch);
            }
        }

        if (word.length() > 0)                     // Adding the last word if it exists
		{               
            allWords.append(word);
        }
        return allWords.toString().split(",");           // change the string builder into string with "," as split.
    }

    // Creating method getStringLength to find the length of a string without using length()
    public static int getStringLength(String str) 
	{
        int length = 0;
        for (char ch : str.toCharArray()) 
		{
            length+=1;
        }
        return length;
    }

    public static String[][] getWordsWithLengths(String[] words)          // create a 2D array of words and their lengths
	{
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));      // calling the method 
        }
        return result;
    }  
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the text
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Splitting the text into words
        String[] words = splitIntoWords(inputText);                 // split the sentence into words

        // Getting the 2D array with words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

       // Displaying the result in a tabular format
        System.out.printf("%-15s | %-10s%n", "Word", "Length");             //  -15: Left-align the string in a field of 15 characters. 
		
        System.out.println("----------------------------");
        for (String[] row : wordsWithLengths) {
            System.out.printf("%-15s | %-10d%n", row[0], Integer.parseInt(row[1]));     // Integer.parseInt converthing the string into int.
        }

        scanner.close();    // closing the scanner object 
    }
}

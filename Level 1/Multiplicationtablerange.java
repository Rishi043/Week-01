import java.util.Scanner;

public class Multiplicationtablerange {
    public static void main(String[] args) {
    
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // enter the number they want the multiplication table of
        System.out.print("Enter a number to generate its multiplication table (from 6 to 9): ");
        int number = input.nextInt();

        // making an array to store the results of multiplication from 6 to 9
        int[] multiplicationResult = new int[4];

        // Loop from 6 to 9 to calculate and store results in the multiplication table array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
			
			/* Explanation:
			
			i - 6: This part of the line adjusts the index to match the position in the multiplicationResult array.
			The array multiplicationResult has 4 elements (for numbers 6, 7, 8, and 9)
			When i = 6, the i - 6 will be 0, so multiplicationResult[0] = number * 6.
			When i = 7, the i - 6 will be 1, so multiplicationResult[1] = number * 7, and so on.
			number * i: This part of the line multiplies the number entered by the user with the current value of i (which goes from 6 to 9).
			
			*/	
        }

        // Displaying the results in the desired format
        System.out.println("Multiplication Table for " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) 
		{
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        // Closing the Scanner object
        input.close();
    }
}

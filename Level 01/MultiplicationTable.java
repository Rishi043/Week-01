
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // enter a number
        System.out.print("Enter the number to print the multiplication table: ");
        int number = input.nextInt();
        
        // Use a for loop to generate the multiplication table from 6 to 9
		
        for (int i = 6; i <= 9; i++) {
		
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result); 
            // Print the result
        }
        
        input.close();  // Close the scanner
    }
}


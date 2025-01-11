// Creating Class with name SmallestNumber to check if the first number is the smallest

import java.util.Scanner;

public class SmallestNumber{
    public static void main(String args[]){   

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the first number
        System.out.println("Enter the first number: ");
		
        // Take input for the first number
        int number1 = input.nextInt(); 
        
        // enter the second number
        System.out.println("Enter the second number: ");
		
        // Take input for the second number
        int number2 = input.nextInt(); 
        
        // enter the third number
        System.out.println("Enter the third number: ");
		
        // Take input for the third number
        int number3 = input.nextInt(); 
        
        // Check if the first number is the smallest among the three numbers
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}

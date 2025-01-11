// Creating Class with name LargestNumber to check if the first, second, or third number is the largest

import java.util.Scanner;

public class LargestNumber{
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
        
        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Display the results for each number
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
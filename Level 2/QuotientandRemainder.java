// Creating Class with name QuotientandRemainder to calculate quotient and remainder of two numbers

import java.util.Scanner;

public class QuotientandRemainder { 

    public static void main(String args[]){  
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // Prompt user to enter the first number
        System.out.println("Enter number 1: ");
        
        // Take input for the first number
        int number1 = input.nextInt(); 
        
        // Prompt user to enter the second number
        System.out.println("Enter number 2: ");
        
        // Take input for the second number
        int number2 = input.nextInt(); 
        
        // Calculate the quotient by dividing number1 by number2
        int quotient = number1 / number2;
        
        // Calculate the remainder using the modulus operator
        int remainder = number1 % number2;
        
        // Print the result quotient and remainder of number1 and number2
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
    }
}


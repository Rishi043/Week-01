// Creating Class with name Calculator to perform basic arithmetic operations

import java.util.Scanner;

public class Calculator { 
    public static void main(String args[]){  

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the first number
        System.out.println("Enter number 1: ");
        
        // Take input for the first number and store it in 'number1' variable
        double number1 = input.nextDouble(); 
        
        // enter the second number
        System.out.println("Enter number 2: ");
        
        // Take input for the second number and store it in 'number2' variable
        double number2 = input.nextDouble(); 

        // Perform addition of the two numbers
        double add = number1 + number2;
        
        // Perform subtraction of the two numbers
        double subtract = number1 - number2;
        
        // Perform multiplication of the two numbers
        double product = number1 * number2;
        
        // Perform division of the two numbers
        double division = number1 / number2;
       
        // Display the results of all operations
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers are: " 
                           + add + ", " + subtract + ", " + product + ", and " + division);
    }
}

// Creating Class with name DivisibleBy5 to check if a number is divisible by 5

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String args[]){   

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter a number
        System.out.println("Enter a number: ");
        
        // Take input for the number
        int number = input.nextInt(); 
        
        // Check if the number is divisible by 5 using modulo operation
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}

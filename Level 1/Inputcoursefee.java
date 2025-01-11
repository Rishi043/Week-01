// Creating Class with name Inputcoursefee to calculate the discount and final course fee after applying discount

import java.util.Scanner;

public class Inputcoursefee { 
    public static void main(String args[]){  
        
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in); 
        
        // enter the course fees
        System.out.println("Enter the fees: ");
        
        // Take input for the original course fee and store it in 'fees' variable
        double fees = input.nextDouble(); 
        
        // Prompt the user to enter the discount percentage
        System.out.println("Enter the discount percent: ");
        
        // Take input for the discount percentage and store it in 'discountPercent' variable
        double discountPercent = input.nextDouble(); 
        
        // Calculate the discount amount by multiplying the discount percentage with the fees
        double discount = (discountPercent / 100) * fees;

        // Calculate the final discounted fee by subtracting the discount from the original fees
        double discountedfee = fees - discount;
        
        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedfee);
    }
}

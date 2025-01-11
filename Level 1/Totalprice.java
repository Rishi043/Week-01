// Creating Class with name Totalprice to calculate the total purchase price

import java.util.Scanner;

public class Totalprice {
    public static void main(String args[]){   

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the unit price
        System.out.println("Enter the unit price: ");
        
        // Take input for the unit price
        double unitPrice = input.nextDouble(); 
        
        // enter the quantity
        System.out.println("Enter the quantity: ");
        
        // Take input for the quantity
        double quantity = input.nextDouble(); 
        
        // Calculate the total price 
        double total = unitPrice * quantity;
        
        // Display the result
        System.out.println("The total purchase price is INR " + total + "  if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}

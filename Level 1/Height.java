// Creating Class with name Height to convert height from cm to feet and inches

import java.util.Scanner;

public class Height { 
    public static void main(String args[]){  
    
        // Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
    
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter height in centimeters
        System.out.println("Enter the Height in cm: ");
        
        // Take input for height in cm and store it in 'cm' variable
        double cm = input.nextDouble(); 
        
        // Convert height in cm to inches using the formula: inches = cm / 2.54
        double inches = cm / 2.54;
        
        // Convert height in inches to feet using the formula: feet = inches / 12
        double feet = inches / 12;
        
        // Display the height in cm, feet, and inches
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}

// Creating Class with name Areaoftriangle to calculate the area of a triangle

import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String args[]){  

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the base of the triangle
        System.out.println("Enter the base of triangle: ");
        
        // Take input for the base and store it in the 'base' variable
        double base = input.nextDouble(); 

        // enter the height of the triangle
        System.out.println("Enter the height of triangle: ");
        
        // Take input for the height and store it in the 'height' variable
        double height = input.nextDouble(); 
        
        // Calculate the area of the triangle using the formula: (0.5 * base * height)
        double area = 0.5 * base * height;
       
        // Display the result of the area calculation
        System.out.println("The area of the triangle is " + area);
    }
}

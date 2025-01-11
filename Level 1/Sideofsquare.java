// Creating Class with name Sideofsquare to calculate the side length from the perimeter of a square

import java.util.Scanner;

public class Sideofsquare {
    public static void main(String args[]){  

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the perimeter of the square
        System.out.println("Enter the perimeter: ");
        
        // Take input for the perimeter and store it in the 'perimeter' variable
        double perimeter = input.nextDouble(); 
        
        // Calculate the length of one side of the square by dividing the perimeter by 4
        double side = perimeter / 4;
       
        // Display the result showing the side length and the given perimeter
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

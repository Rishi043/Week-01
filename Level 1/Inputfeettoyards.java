// Creating Class with name Inputfeettoyards to convert distance in feet to yards and miles

import java.util.Scanner;

public class Inputfeettoyards {
    public static void main(String args[]){  

        // 1 mile = 1760 yards and 1 yard = 3 feet

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the distance in feet
        System.out.println("Enter the distance in feet: ");
        
        // Take input for the distance in feet
        double feet = input.nextDouble(); 
        
        // Convert feet to yards (1 yard = 3 feet)
        double yards = feet / 3; 
        
        // Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;
        
        // Display the results: distance in feet, yards, and miles
        System.out.println("The distance in feet is " + feet + " while in yards is " + yards + " and in miles is " + miles);
    }
}

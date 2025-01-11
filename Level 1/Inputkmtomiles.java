// Creating Class with name Inputkmtomiles to convert kilometers to miles

import java.util.Scanner;

public class Inputkmtomiles { 
    public static void main(String args[]){   
        
        // Create a Scanner object to take user input for distance in kilometers
        Scanner input = new Scanner(System.in); 
        
        // Prompt the user to enter the distance in kilometers
        System.out.println("Enter the distance in km: ");
        
        // Take input from the user for the distance in kilometers
        double km = input.nextDouble(); 
        
        // Convert the distance from kilometers to miles using the conversion factor (1 km = 1.6 miles)
        double miles = 1.6 * km;
        
        // Print the result in miles for the given distance in kilometers
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
    }
}

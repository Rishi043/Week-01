
import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String args[]) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter the countdown start number
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();  // Read the user input for countdown start number
        
        // Use a for loop to countdown from the entered number to 1
        for (int i = counter; i > 0; i--) {
		
            System.out.println(i);  // Print the current countdown value
        }

        // Print launch message when countdown finishes
        System.out.println("Launched!");

        // Close the scanner object
        input.close();
    }
}


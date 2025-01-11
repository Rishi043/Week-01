
import java.util.Scanner;

public class RocketLaunchWhile {
    public static void main(String args[]) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the countdown start number
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();  //user input for countdown 
        
        // Use a while loop to countdown from the entered number to 1
        while (counter > 0) {
            System.out.println(counter);  // Print the current value
			
            counter--;  // Decrease the counter by 1 each time
        }

        // Print launch message when countdown finishes
        System.out.println("Launched!");

        // Close the scanner
        input.close();
    }
}



import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        //enter the integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;

        // Loop from number - 1 to 1 to find the greatest factor
		
		// loop running from backwards.
		
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  // Update the greatest factor
                break;  // Exit the loop as we found the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        input.close();
    }
}


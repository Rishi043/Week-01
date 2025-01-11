import java.util.Scanner;

public class Powerofnumber {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // enter the base number and the power
		
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result variable to 1
        int result = 1;

        // Loop to calculate the power of the number
		
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result with the base number in each iteration
        }

        // Print the final result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        input.close();
    }
}

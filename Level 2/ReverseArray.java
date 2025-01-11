import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Convert the number to a string to get digits easily
        String numStr = Integer.toString(number);

        // Print the digits in reverse order
        System.out.print("Reversed Number: ");
        for (int i = numStr.length() - 1; i >= 0; i--) {
            System.out.print(numStr.charAt(i));
        }

        // Close the scanner
        input.close();
    }
}

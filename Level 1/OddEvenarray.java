import java.util.Scanner;
public class OddEvenarray {
    public static void main(String[] args) {

        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the entered number is positive
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            System.exit(0);
        }

        // Option 1: Allocate enough space for the arrays (recommended)
        int[] evenNumbers = new int[number];
        int[] oddNumbers = new int[number];

        // Option 2: Modify the loop condition
        // int[] evenNumbers = new int[number / 2];
        // int[] oddNumbers = new int[number / 2];

        int evenIndex = 0, oddIndex = 0;

        // Loop to iterate from 1 to number-1 (Option 2) or up to number (Option 1)
        for (int i = 1; i <= number; i++) { // Option 1
        // for (int i = 1; i < number; i++) { // Option 2
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Display even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println(); // New line

        // Display odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Closing the Scanner object
        input.close();
    }
}
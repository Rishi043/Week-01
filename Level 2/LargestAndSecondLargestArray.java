import java.util.Scanner;

public class LargestAndSecondLargestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object for user input

        System.out.print("Enter a number: ");  // Take user input for the number
        int number = input.nextInt();

        int[] digits = new int[10];  // Array to store digits (size is set to maxDigit, initially 10)
        int maxDigit = 10;
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {
            digits[index] = number % 10;  // Extract the last digit
            number /= 10;  // Remove the last digit from the number
            index++;
            if (index == maxDigit) break;  // If index reaches maxDigit, break the loop
        }

        // Variables to store the largest and second largest digit
        int largest = Integer.MIN_VALUE;  // Smallest possible integer initially
        int secondLargest = Integer.MIN_VALUE;

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update secondLargest before changing largest
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();  // Close the scanner obj
    }
}

import java.util.Scanner;

public class LargestAndSecondLargestArrayNew {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Creating an array to store digits (initial size set to maxDigit)
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {
            // Check if the array is full
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;

                // Creating a temporary array with the new size
                int[] temp = new int[maxDigit];

                // Copying elements from the old array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array to the digits array
                digits = temp;
            }

            // Extract the last digit and store it in the array
            digits[index] = number % 10;

            // Remove the last digit from the number
            number /= 10;

            // Increment the index for the next digit
            index++;
        }

        // Variables to store the largest and second largest digit
        int largest = Integer.MIN_VALUE;  // Smallest possible integer initially
        int secondLargest = Integer.MIN_VALUE;

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                // Update secondLargest before changing largest
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner object
        input.close();
    }
}

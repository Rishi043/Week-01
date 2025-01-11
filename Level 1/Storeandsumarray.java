import java.util.Scanner;

public class Storeandsumarray {
    public static void main(String[] args) {
        
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Defining an array to store up to 10 double values
        double[] numbers = new double[10];

        // Variable to store the sum of all numbers
        double total = 0.0;

        // Index variable to keep track of array position
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();

            // Break loop if user enters 0 or a negative number
            if (userInput <= 0) {
                break;
            }
            // Break the loop if the array is full (index = 10)
            if (index >= 10) {
                break;
            }

            // Store the number of elements in the array
            numbers[index] = userInput;
            index++;                      // index will be incremented                  
        }

        // Loop through the array to calculate the sum of all elements
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Displaying all the numbers and the total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total sum of all numbers: " + total);

        // Closing the Scanner object
        input.close();
    }
}

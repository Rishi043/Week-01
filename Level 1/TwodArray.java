// Creating Class with name TwodArray to handle 2D and 1D array conversion
import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for rows
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Taking user input for columns
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Creating a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Taking user input for elements of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Creating a 1D array of size rows * columns
        int[] array = new int[rows * columns];

        // Defining index for the 1D array
        int index = 0;

        // Looping through the 2D array to copy elements to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Printing the 1D array manually without using Arrays.toString()
		// Printing the 1D array using Arrays.toString() for simplicity
		
        // System.out.println("The 1D array is: " + Arrays.toString(array));
        // System.out.print("The 1D array is: ");
		
		
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Adding a newline for better output formatting

        // Closing the input object
        input.close();
    }
}

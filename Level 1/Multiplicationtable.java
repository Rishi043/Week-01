import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
    
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // enter the number 
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        // making an array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];

        // Loop from 1 to 10 to calculate and store results in the multiplication table array
		
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Displaying the results in the desired format
		
        System.out.println("Multiplication Table for " + number + ":");
		
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        // Closing the Scanner object 
        input.close();
    }
}

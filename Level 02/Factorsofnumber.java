import java.util.Scanner;

public class Factorsofnumber {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if the number is divisible by i
                System.out.println(i);  // Print the factor
            }
        }

        input.close();
    }
}

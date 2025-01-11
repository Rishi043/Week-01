import java.util.Scanner;

public class Swapnumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}


import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Count the digits
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        // Handle case for 0
        if (count == 0) {
            count = 1;
        }

        // Output the result
        System.out.println("Number of digits: " + count);

        input.close();
    }
}


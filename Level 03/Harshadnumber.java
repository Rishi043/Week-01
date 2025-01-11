import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; // Store the original number
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10;  // Extract the last digit and add it to sum
            number /= 10;        // extract the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0)
		{
            System.out.println(originalNumber + " is a Harshad Number.");
        } 
		else 
		{
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }
}

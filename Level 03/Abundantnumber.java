
import java.util.Scanner;

public class Abundantnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // Calculate the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) 
			{                      // Check if i is a divisor
                sum += i;                // Add the divisor to the sum
            }
        }

        // Check if the number is an Abundant Number
        if (sum > number) 
	  {
            System.out.println(number + " is an Abundant Number.");
        }
	  else 
	  {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}


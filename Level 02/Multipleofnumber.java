import java.util.Scanner;

public class Multipleofnumber {
    public static void main(String[] args) {
	
        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
		
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print the multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1 to check for multiples
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  // Check if i is a multiple of the number
                System.out.println(i);  // Print the multiple
            }
        }

        input.close();
    }
}

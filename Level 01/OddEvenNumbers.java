import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("enter a natural number greater than 0.");
            return;  // Exit if the number is not a positive integer
        }

        // Use a for loop to iterate
        for (int i = 1; i <= number; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        
        input.close();  // Close the scanner
    }
}

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        String number = input.next();

        // Create an array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Loop through each character in the number string
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                frequency[digit - '0']++;
            }
        }

        // Display the frequency of each digit, excluding digits with zero frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        input.close();
    }
}

import java.util.Scanner;

public class SumNaturalNumbers {
    // Method to find the sum of first 'n' natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop through numbers 1 to n and calculate sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Input number
        // Display the sum
        System.out.println("Sum: " + sumOfNaturalNumbers(n));
        scanner.close();
    }
}

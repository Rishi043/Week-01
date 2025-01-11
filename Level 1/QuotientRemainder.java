import java.util.Scanner;

public class QuotientRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // Input dividend and divisor
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();

        // Calculate and display quotient and remainder
        int[] result = findRemainderAndQuotient(num, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        scanner.close();
    }
}

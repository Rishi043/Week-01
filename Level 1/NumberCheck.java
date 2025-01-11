import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int num) {
        return (num < 0) ? -1 : (num > 0) ? 1 : 0;    // ternary operator
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Result: " + checkNumber(num));
        scanner.close();
    }
}

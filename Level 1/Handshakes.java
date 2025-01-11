import java.util.Scanner;

public class Handshakes {
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        System.out.println("Maximum number of handshakes: " + maxHandshakes(n));
        scanner.close();
    }
}

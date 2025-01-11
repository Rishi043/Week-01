import java.util.Scanner;

public class MinMax {
    // Method to find smallest and largest numbers among three
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c)); // Find smallest
        int largest = Math.max(a, Math.max(b, c)); // Find largest
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        // Input three numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate and display smallest and largest numbers
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        scanner.close();
    }
}

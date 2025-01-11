import java.util.Scanner;

public class ChocolateDistribution {
    // Method to find chocolates each child gets and remaining chocolates
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        // Input chocolates and children
        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();

        // Calculate and display distribution
        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
        scanner.close();
    }
}

import java.util.Arrays;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate delta (b^2 - 4ac)

        // If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a); // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a); // Second root
            return new double[]{root1, root2}; // Return both roots as an array
        }
        // If delta is zero, there is only one real root
        else if (delta == 0) {
            double root = -b / (2 * a); // Single root
            return new double[]{root}; // Return single root in an array
        }
        // If delta is negative, there are no real roots
        else {
            return new double[]{}; // Return an empty array indicating no real roots
        }
    }

    public static void main(String[] args) {
        // Input coefficients of the quadratic equation
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the coefficient b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the coefficient c: ");
        int c = scanner.nextInt();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.printf("The root is: %.2f%n", roots[0]);
        } else {
            System.out.printf("The roots are: %.2f and %.2f%n", roots[0], roots[1]);
        }

        scanner.close();
    }
}

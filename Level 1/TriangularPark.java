import java.util.Scanner;

public class TriangularPark {
    public static int calculateRounds(double a, double b, double c, double distanceKm)
	{
        double perimeter = a + b + c;
        return (int) ((distanceKm * 1000) / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle (in meters): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Rounds needed: " + calculateRounds(a, b, c, 5));
        scanner.close();
    }
}

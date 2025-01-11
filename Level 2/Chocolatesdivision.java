import java.util.Scanner;

class Chocolatesdivision {

    public static void main(String[] args) {

        // Input object
        Scanner input = new Scanner(System.in);

        // Get chocolates and children count
        System.out.print("Enter chocolates: ");
        int chocolates = input.nextInt();

        System.out.print("Enter children: ");
        int children = input.nextInt();

        // Calculate chocolates per child and remainder
        int perChild = chocolates / children;
        int remainingchocolates = chocolates % children;

        // Output results
        System.out.println("The number of chocolates each child gets is " + perChild + " and the number of remaining chocolates are " + remainingchocolates);

    }
}

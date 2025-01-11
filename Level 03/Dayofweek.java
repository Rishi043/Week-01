// Creating a class named Dayofweek to calculate the day of the week for a given date
import java.util.Scanner;

public class Dayofweek {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input for the month (1-12)
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();

        // Taking input for the day (1-31)
        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();

        // Taking input for the year
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Calculating the adjusted year (y0) based on the month
        int y0 = y - (14 - m) / 12;

        // Calculating the leap year correction (x)
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Adjusting the month to align with the formula (m0)
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculating the day of the week (d0) using the formula
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Printing the result: Day of the week (0=Sunday, 1=Monday, ..., 6=Saturday)
        System.out.println("Day of the week (0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday): " + d0);

        // Closing the Scanner object 
        input.close();
    }
}

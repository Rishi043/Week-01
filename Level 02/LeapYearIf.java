import java.util.Scanner;

public class LeapYearIf {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Check if the year is a leap year using a single if condition with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();  // Close the scanner
    }
}

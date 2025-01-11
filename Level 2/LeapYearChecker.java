import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. Divisible by 4 and not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt(); // Take year input from the user

        // Check if the year is valid (Gregorian calendar starts in 1582)
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            // Determine if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close(); // Close the scanner
    }
}

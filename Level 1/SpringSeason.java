import java.util.Scanner;

public class SpringSeason {
    // Method to check if the date is in the spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season from March 20 to June 20
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        // Input month and day
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Check and display whether it's spring season
        System.out.println(isSpringSeason(month, day) ? "It's Spring Season" : "Not a Spring Season");
        scanner.close();
    }
}

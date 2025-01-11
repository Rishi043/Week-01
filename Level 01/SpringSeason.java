
// Creating Class with name SpringSeason to check if the given date is within the Spring season

import java.util.Scanner;

public class SpringSeason {
    public static void main(String args[]) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter the month and day
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();  
		// Month as a number (1 = January, 2 = February, ..., 12 = December)
        
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();    
		// Day as a number

        // Check if the given month and day is within the Spring Season   (March 20 to June 20)
		
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) 
		{
            // If the month is March and day is 20 or later, or if the month is April, May, or June and day is 20 or earlier
            System.out.println("It's a Spring Season");
        } 
		else
		{
            // If the date is outside the Spring Season
            System.out.println("Not a Spring Season");
        }

        // Close the scanner
        input.close();
    }
}


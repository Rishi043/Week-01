
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Ensure the year is not before 1582 (Gregorian calendar)
        if (year < 1582) {
		
            System.out.println("Year must be greater than or equal to 1582.");
        }
		else 
		{
            // Check for leap year using one if statement with logical operators
			
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			{
                System.out.println(year + " is a Leap Year.");
            } 
			else 
			{
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();  // Close the scanner object
    }
}


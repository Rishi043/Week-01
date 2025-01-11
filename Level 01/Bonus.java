
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        //  enter the salary of the employee
        System.out.print("Enter the salary of the employee: ");
        double salary = input.nextDouble();
        
        //enter the years of service 
        System.out.print("Enter the years of service of the employee: ");
        int yearsOfService = input.nextInt();
        
        // Initialize bonus variable
        double bonus = 0;
        
        // Check if the years of service is greater than 5
        if (yearsOfService > 5) {
            // Calculate bonus as 5% of the salary
            bonus = 0.05 * salary;
        }
        
        // Print the bonus amount
        System.out.println("The bonus for the employee is: INR " + bonus);
        
        input.close(); // Close the scanner
    }
}


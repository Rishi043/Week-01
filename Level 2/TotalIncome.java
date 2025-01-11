import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object named 'input'
        Scanner input = new Scanner(System.in);

        // enter the salary
        System.out.print("Enter the salary (INR): ");
        double salary = input.nextDouble();

        // enter the bonus
        System.out.print("Enter the bonus (INR): ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        // Close the scanner obj
        input.close();
    }
}

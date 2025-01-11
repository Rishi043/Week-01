// Creating Class with name BonusCalculator to calculate bonuses and salaries of employees
import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) 
	{
        final int NUM_EMPLOYEES = 10;
        final double BONUS_ABOVE_5_YEARS = 0.05;
        final double BONUS_BELOW_5_YEARS = 0.02;

        Scanner input = new Scanner(System.in);

        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            salaries[i] = input.nextDouble();

            System.out.print("Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            // Calculate bonus using simple if-else logic
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * BONUS_ABOVE_5_YEARS;
            } else {
                bonus = salaries[i] * BONUS_BELOW_5_YEARS;
            }

            double newSalary = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;

            System.out.printf("Bonus = %.2f, New Salary = %.2f%n", bonus, newSalary);
        }

        System.out.printf("%nTotal Bonus: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        input.close();
    }
}

import java.util.Scanner;

public class BMICalculatorArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Arrays for height, weight, BMI, and status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        // Input height and weight
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine status based on BMI
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        input.close();
    }
}

import java.util.Scanner;

public class BMICalculatorMultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3];  // [i][0] = height, [i][1] = weight, [i][2] = BMI
        String[] weightStatus = new String[numPersons];

        // Input height and weight
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < numPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}

import java.util.Scanner;

public class BMICalculatorMethod {

    // Method to calculate BMI for each person and store it in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100;
            // Calculate BMI
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine the BMI status for each person and return an array with status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize 2D array to store weight (kg), height (cm), and BMI for each person
        double[][] data = new double[10][3];

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Weight (kg)

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Height (cm)
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI   | Status");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %11.2f | %12.2f | %.2f | %s\n",
                i + 1, data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}

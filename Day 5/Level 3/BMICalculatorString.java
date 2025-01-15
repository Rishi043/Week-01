import java.util.Scanner;

public class BMICalculatorString {

    public static String[][] calculateBMIAndStatus(double weight, double height) {
		
        // Convert height from cm to meters
		double heightInMeters = height / 100; 
		
        double bmi = weight / (heightInMeters * heightInMeters); 
		
        bmi = Math.round(bmi * 100.0) / 100.0; // Round BMI to two decimal places

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 40) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        String[][] result = {
                {Double.toString(height), Double.toString(weight), Double.toString(bmi), status}
        };
        return result;
    }

    public static String[][] computeBMIForTeam(double[][] weightHeightData) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = weightHeightData[i][0];
            double height = weightHeightData[i][1];
            String[][] individualResult = calculateBMIAndStatus(weight, height);
            result[i] = individualResult[0];
        }
        return result;
    }

    public static void displayBMITable(String[][] bmiData) {
        System.out.printf("%-8s%-15s%-15s%-10s%-15s\n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-8d%-15s%-15s%-10s%-15s\n", i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] weightHeightData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeightData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeightData[i][1] = scanner.nextDouble();
        }

        String[][] bmiData = computeBMIForTeam(weightHeightData);
        displayBMITable(bmiData);
    }
}
import java.util.Scanner;

public class BMI{
	
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        //  weight in kg
        System.out.print("Enter your weight (in kg): ");
        double weight = input.nextDouble();

        //  height in cm
        System.out.print("Enter your height (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Output the BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on the updated chart
        String status;

        if (bmi <= 18.4) 
		{
            status = "Underweight";
        } 
		else if (bmi >= 18.5 && bmi <= 24.9)
		{
            status = "Normal";
        } 
		else if (bmi >= 25.0 && bmi <= 39.9) 
		{
            status = "Overweight";
        } 
		else 
		{
            status = "Obese";
        }

        // Output the weight status
        System.out.println("Your weight status is: " + status);

        // Close the scanner object
        input.close();
    }
}
import java.util.Scanner;

class Weightconverter{

    public static void main(String[] args) {

        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get weight in pounds from the user
		
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        // Conversion factor: 1 pound = 2.2 kg
		
        double kilograms = pounds * 2.2;

        // Output the results
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);

    }
}


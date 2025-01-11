import java.util.Scanner;

class TotalRounds {

    public static void main(String[] args) {
        
        // Create a scanner object named 'input' for user inputs
        Scanner input = new Scanner(System.in);

        // Get user input for the sides of the triangular park
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();  // Reading the first side length

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();  // Reading the second side length

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();  // Reading the third side length

        // Calculate the perimeter of the triangle (sum of all three sides)
        double perimeter = side1 + side2 + side3;  // Summing the three sides to get the perimeter

        // Convert the 5 km run distance to meters
        double runDistance = 5000;  // 5 km = 5000 meters

        // Calculate the number of rounds the athlete must complete
        double rounds = runDistance / perimeter;  // Dividing the total distance by the perimeter
		
		// Round the result to the nearest integer
        int roundedRounds = (int) Math.round(rounds);

        // Print the number of rounds the athlete needs to run
        System.out.println("The total number of rounds the athlete will run is " + roundedRounds + " to complete 5 km");

    }
}

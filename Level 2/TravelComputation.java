import java.util.Scanner;

class TravelComputation {

    public static void main(String[] args) {
        
        // Create a scanner object named 'input' for user inputs
        Scanner input = new Scanner(System.in);

        // Get user input for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();  // Reading the user's name

        // Get user input for cities
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = input.nextLine();  // Reading the 'from' city

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = input.nextLine();  // Reading the 'via' city

        System.out.print("Enter the city you are traveling to: ");
        String toCity = input.nextLine();  // Reading the 'to' city

        // Get user input for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();  // Reading the distance between fromCity and viaCity

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();  // Reading the distance between viaCity and toCity

        // Get user input for travel times in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();  // Reading the time from fromCity to viaCity

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();  // Reading the time from viaCity to toCity

        // Compute total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;  // Summing up the distances
        int totalTime = timeFromToVia + timeViaToFinalCity;  // Summing up the times

        // Print the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity + 
                " is " + totalDistance + " miles and " +
                "the Total Time taken is " + totalTime + " minutes");
        
    }
}

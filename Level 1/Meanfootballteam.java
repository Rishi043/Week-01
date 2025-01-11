// Creating a class named Meanfootballteam to calculate the mean height of players in a football team
import java.util.Scanner;

public class Meanfootballteam {
    public static void main(String[] args) {
    
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        
        // making a double array named heights to store the heights of players (size 11)
        double[] heights = new double[11];

        // Variable to store the sum of all heights
        double totalHeight = 0.0;

        // Asking the user to enter the heights of 11 players
        System.out.println("Enter the heights of 11 players:");

        // Loop to take input for the heights of each player
        for (int i = 0; i < heights.length; i++) 
		{
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();  // Storing each player's height in the `heights` array
        }

        // Loop to calculate the sum of all heights
        for (int i = 0; i < heights.length; i++) 
		{
            totalHeight += heights[i];  // Adding each player's height to the total
        }

        // Calculate the mean height by dividing the total sum by the number of players (11)
        double meanHeight = totalHeight / heights.length;

        // Displaying the mean height of the football team
        System.out.println("The mean height of the football team is: " + meanHeight + " meters");

        // Closing the Scanner object 
        input.close();
    }
}

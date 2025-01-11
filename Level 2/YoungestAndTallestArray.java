import java.util.Scanner;

public class YoungestAndTallestArray {
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);  // Scanner object for user input

        // Arrays to store age and height of Amar, Akbar, and Anthony
        int[] ages = new int[3];    // Array to store ages of friends
        double[] heights = new double[3];  // Array to store heights of friends

        // Input for ages of Amar, Akbar, and Anthony
        System.out.println("Enter the ages of the friends:");

        System.out.print("Age of Amar: ");
        ages[0] = input.nextInt();

        System.out.print("Age of Akbar: ");
        ages[1] = input.nextInt();

        System.out.print("Age of Anthony: ");
        ages[2] = input.nextInt();

        // Input for heights of Amar, Akbar, and Anthony
        System.out.println("Enter the heights of the friends:");

        System.out.print("Height of Amar (in cm): ");
        heights[0] = input.nextDouble();

        System.out.print("Height of Akbar (in cm): ");
        heights[1] = input.nextDouble();

        System.out.print("Height of Anthony (in cm): ");
        heights[2] = input.nextDouble();

        // Find the youngest friend
        int youngestAge = ages[0];  // Assume the first friend (Amar) is the youngest initially
        String youngestFriend = "Amar";  // Name of the youngest friend

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                if (i == 0) youngestFriend = "Amar";
                else if (i == 1) youngestFriend = "Akbar";
                else youngestFriend = "Anthony";
            }
        }

        // Find the tallest friend
        double tallestHeight = heights[0];  // Assume the first friend (Amar) is the tallest initially
        String tallestFriend = "Amar";  // Name of the tallest friend

        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                if (i == 0) tallestFriend = "Amar";
                else if (i == 1) tallestFriend = "Akbar";
                else tallestFriend = "Anthony";
            }
        }

        // Output the youngest and tallest friend
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge + " years");
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        input.close();  // Close the scanner to avoid resource leaks
    }
}

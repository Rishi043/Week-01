
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking for the age and height of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = input.nextInt();

        // Asking for the age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = input.nextInt();

        // Asking for the age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = input.nextInt();

        // Find the youngest friend based on the smallest age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend based on the largest height
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is " + youngestFriend + " with an age of " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + " cm.");

        // Close the scanner object
        input.close();
    }
}


import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest among three friends
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0; // Index of the youngest friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex; // Return the index of the youngest
    }

    // Method to find the tallest among three friends
    public static int findTallest(double[] heights) {
        int tallestIndex = 0; // Index of the tallest friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex; // Return the index of the tallest
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Taking input for ages and heights of the friends
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the age of %s: ", names[i]);
            ages[i] = scanner.nextInt();
            System.out.printf("Enter the height of %s (in cm): ", names[i]);
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest and the tallest friend
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Displaying the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        scanner.close(); // Close the scanner
    }
}

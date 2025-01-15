import java.util.Scanner;
import java.util.Random;

public class VotingString {

    // Method to generate random ages for students
    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        // Generate random ages (from 1 to 99)
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(99) + 1; // Generate random age from 1 to 99
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]); // Store age as String
            if (ages[i] < 0) {
                eligibility[i][1] = "false"; // Negative age, cannot vote
            } else {
                eligibility[i][1] = (ages[i] >= 18) ? "true" : "false"; // Voting eligibility
            }
        }
        return eligibility;
    }

    // Method to display the 2D array in tabular format
    public static void displayEligibility(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("-------------------");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = scanner.nextInt();

        // Generating random ages
        int[] ages = generateAges(numberOfStudents);

        // Determining voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Displaying results in a tabular format
        System.out.println("\nVoting Eligibility:");
        displayEligibility(eligibility);

        scanner.close();
    }
}

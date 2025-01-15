import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for PCM
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(100); // Physics
            scores[i][1] = random.nextInt(100); // Chemistry
            scores[i][2] = random.nextInt(100); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalsAndPercentage(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Store rounded values
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grades based on the updated criteria
    public static String[] calculateGrades(double[][] percentages) {
        String[] grades = new String[percentages.length];

        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2]; // Percentage is in column 2

            if (percentage >= 80) {
                grades[i] = "A"; // Level 4
            } else if (percentage >= 70) {
                grades[i] = "B"; // Level 3
            } else if (percentage >= 60) {
                grades[i] = "C"; // Level 2
            } else if (percentage >= 50) {
                grades[i] = "D"; // Level 1
            } else if (percentage >= 40) {
                grades[i] = "E"; // Level 1-
            } else {
                grades[i] = "R"; // Remedial standards
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("S%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate totals, averages, and percentages
        double[][] results = calculateTotalsAndPercentage(scores);

        // Determine grades
        String[] grades = calculateGrades(results);

        // Display the scorecard
        System.out.println("\nStudent Scorecard:");
        displayScorecard(scores, results, grades);

        scanner.close();
    }
}

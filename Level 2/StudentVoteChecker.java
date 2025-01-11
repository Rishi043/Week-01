import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Returns true if age is 18 or above, otherwise false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Loop to take user input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter the age of student %d: ", i + 1);
            studentAges[i] = scanner.nextInt();

            // Check voting eligibility
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Invalid age. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student is eligible to vote.");
            } else {
                System.out.println("Student is not eligible to vote.");
            }
        }

        scanner.close(); // Close the scanner
    }
}

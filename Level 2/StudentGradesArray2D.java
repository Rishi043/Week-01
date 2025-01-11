import java.util.Scanner;

public class StudentGradesArray2D{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3]; // Rows = students, Columns = subjects
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks and validate
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    int mark = scanner.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks cannot be negative. Please enter a valid mark.");
                    }
                }
            }

            // Calculate percentage and grade
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("   " + (i + 1) + "       " + marks[i][0] + "        " + marks[i][1] + 
                             "        " + marks[i][2] + "       " + percentages[i] + "        " + grades[i]);
            System.out.println();
        }

        scanner.close();
    }
}

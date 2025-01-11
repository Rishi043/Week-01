import java.util.Scanner;

public class StudentGradesArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks and validate
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Physics marks
            while (true) {
                System.out.print("Physics: ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    physics[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter a valid mark.");
                }
            }

            // Chemistry marks
            while (true) {
                System.out.print("Chemistry: ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    chemistry[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter a valid mark.");
                }
            }

            // Maths marks
            while (true) {
                System.out.print("Maths: ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    maths[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter a valid mark.");
                }
            }

            // Calculate percentage and grade
            int total = physics[i] + chemistry[i] + maths[i];
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
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "%", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n", i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}

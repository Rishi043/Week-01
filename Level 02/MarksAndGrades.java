import java.util.Scanner;

public class MarksAndGrades {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks in Physics: ");
        double physics = input.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = input.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100; // Assuming each subject is out of 100

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 80) 
		{
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
		else if (percentage >= 70) 
		{
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }
		else if (percentage >= 60)
		{
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }
		else if (percentage >= 50)
		{
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        }  
		else if (percentage >= 40)
		{
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
		else 
		{
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the result
        System.out.println("Average Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner
        input.close();
    }
}
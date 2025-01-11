import java.util.Scanner;

public class Votearray {
    public static void main(String[] args) {
	
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Defining an array to store the ages of 10 students
        int[] ages = new int[10];

        // Input ages for all 10 students
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {  // Corrected loop to go from 0 to ages.length-1
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Loop through the array to check voting eligibility
        for (int i = 0; i < ages.length; i++) {  // Corrected loop to go from 0 to ages.length-1
            if (ages[i] < 0) 
            {
                // Handling invalid age input
                System.out.println("Invalid age entered for student " + (i + 1));
            } 
            else if (ages[i] >= 18) 
            {
                // Checking if the student can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
            else 
            {
                // Handling students below the voting age
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Closing the Scanner object 
        input.close();
    }
}

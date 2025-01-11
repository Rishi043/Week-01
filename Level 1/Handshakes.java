// Creating Class with name Handshakes to calculate the number of handshakes

import java.util.Scanner;

public class Handshakes { 
    public static void main(String args[]){   

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in); 
        
        // enter the number of students
        System.out.println("Enter the number of students: ");
        
        // Take input for the number of students
        int numberOfStudents = input.nextInt(); 
        
        // Calculate the possible number of handshakes using the formula n(n-1)/2
        int possiblehandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result number of possible handshakes
        System.out.println("The number of possible handshakes: " + possiblehandshakes);
    }
}

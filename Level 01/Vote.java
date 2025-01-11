// Creating Class with name Vote to check if the person can vote or not
import java.util.Scanner;

public class Vote{
    public static void main(String args[]){   
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // enter the age
        System.out.println("Enter the age: ");
        
        // Take the age as input
        int age = input.nextInt(); 
        
        // Check if the person is eligible to vote (age >= 18)
        if (age >= 18) {
            // If the age is 18 or older, the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the age is less than 18, the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the scanner object
        input.close();
    }
}




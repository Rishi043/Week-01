// Creating Class with name DoubleOpt to perform double operations

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter double values for a, b, and c
        System.out.print("Enter the value of a (double): ");
		
        double a = input.nextDouble();  // Taking input for the value of a
        System.out.print("Enter the value of b (double): ");
		
        double b = input.nextDouble();  // Taking input for the value of b
        System.out.print("Enter the value of c (double): ");
		
        double c = input.nextDouble();  // Taking input for the value of c

        // Calculate the results based on operator precedence
        double result1 = a + b * c;      
        double result2 = a * b + c;       
        double result3 = c + a / b;       
        double result4 = a % b + c;       

        // Display the results of the double operations
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);  
        System.out.println("c + a / b = " + result3);  
        System.out.println("a % b + c = " + result4); 

        
        input.close();
    }
}

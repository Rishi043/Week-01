// Creating Class with name IntOperation to perform integer operations

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter integer values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();  // Taking input for the value of a
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();  // Taking input for the value of b
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();  // Taking input for the value of c

        // Compute the results of the operations based on operator precedence
        int result1 = a + b * c;      
        int result2 = a * b + c;       
        int result3 = c + a / b;       
        int result4 = a % b + c; 

        // Display the results of the integer operations
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1); 
        System.out.println("a * b + c = " + result2);  
        System.out.println("c + a / b = " + result3);  
        System.out.println("a % b + c = " + result4);  

        
        input.close();
    }
}

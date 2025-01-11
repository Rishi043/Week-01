import java.util.Scanner;

public class Numbercheckarray {
    public static void main(String[] args) {
    
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // making an array to store 5 integer numbers
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // check whether each number is positive, negative, or zero
		
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) 
				{
                    System.out.println("Number " + (i + 1) + ": Positive even");
                }
				else 
				{
                    System.out.println("Number " + (i + 1) + ": Positive odd");
                }
            } 
			else if (numbers[i] < 0) 
			{
                System.out.println("Number " + (i + 1) + ": Negative");
            } 
			else 
			{
                System.out.println("Number " + (i + 1) + ": Zero");
            }
        }

        // Compare the first and last elements
		
        if (numbers[0] == numbers[numbers.length - 1])    // for last element 
		{
            System.out.println("The first and last elements are equal.");
        } 
		else if (numbers[0] > numbers[numbers.length - 1]) 
		{
            System.out.println("The first element is greater than the last element.");
        } 
		else 
		{
            System.out.println("The first element is less than the last element.");
        }

        // Closing the Scanner object 
        input.close();
    }
}

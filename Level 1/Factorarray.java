import java.util.Scanner;

public class Factorarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number to find its factors: ");
        int num = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10;  // Initial "size" of the factors array
		
        int[] factors = new int[maxFactor];  // Array to store factors
		
        int index = 0;  // Index to reflect the position in the array

        // Loop through numbers from 1 to the number to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) 
			{
                factors[index] = i;
                index++;
				
                // Check if we need more space in the factors array
                if (index == maxFactor) 
				{
                    // Double the size of the array and copy existing elements
                    maxFactor *= 2; 
					
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
            }
        }

        // Display the factors of the number
        System.out.print("Factors of " + num + " are: ");
		
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}

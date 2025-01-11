import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        // Processing each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.printf("Number %d is positive and even.\n", numbers[i]);
                } else {
                    System.out.printf("Number %d is positive and odd.\n", numbers[i]);
                }
            } else {
                System.out.printf("Number %d is negative.\n", numbers[i]);
            }
        }

        // Comparing the first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last numbers are equal.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close(); // Close the scanner
    }
}

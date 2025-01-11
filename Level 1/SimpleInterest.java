import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, and Time: ");
		
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
		
        double simpleInterest = calculateSimpleInterest(principal, rate, time);    // calling the method

		
        System.out.printf("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time); 
                          
        scanner.close();
    }
}

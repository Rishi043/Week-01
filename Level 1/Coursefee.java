// Creating Class with name Coursefee to calculate the discount on course fees

public class Coursefee {
    public static void main(String args[]){ 
        
        // Create a variable fees to store the original course fee
        double fees = 125000;
        
        // Create a variable discountPercent to store the discount percentage
        double discountPercent = 10;
        
        // Calculate the discount amount using the formula: (discountPercent / 100) * fees
        double discount = (discountPercent / 100) * fees;
        
        // Calculate the final discounted fee by subtracting the discount from the original fees
        double discountedfee = fees - discount;
        
        // Print the discount amount and the final discounted course fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedfee);
    }
}

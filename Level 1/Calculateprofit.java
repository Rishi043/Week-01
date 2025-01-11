// Creating Class with name Calculateprofit to calculate profit and profit percentage

public class Calculateprofit{
    public static void main(String args[]){ 
        
        // Create a variable costprice to store the cost price of the item
        double costprice = 129;
        
        // Create a variable sellingprice to store the selling price of the item
        double sellingprice = 191; 
        
        // Calculate the profit by subtracting cost price from selling price
        double profit = sellingprice - costprice;
        
        // Calculate the profit percentage by dividing profit by cost price and multiplying by 100
        double profitpercentage = (profit / costprice) * 100; 
        
        // Print the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage);
	   
	}
}

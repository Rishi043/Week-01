// Creating Class with name ageofHarry to find the age of Harry.

public class ageofHarry{
	
	public static void main (String [] args){
		
		// Create a variable birthyear to indicate the birth year of Harry
		int birthyear = 2000;
		
		// Create a variable currentyear to indicate the current year 
		int currentyear = 2024;
		
		// Create a variable age to calculate the age of Harry
		int age = currentyear - birthyear;   
		
		// Print the age of Harry
		System.out.println("Harry's age in " + currentyear + " is " + age + " years");
	}
}
// Creating Class with name averagepercentmark to find the average percent mark of Sam in PCM

class averagepercentmark {
	
	public static void main(String args[]) 
	
		// Create a variable mathsmarks to store the Maths marks
		double mathsmarks = 94;
		
		// Create a variable physicsmarks to store the Physics marks
		double physicsmarks = 95;
		
		// Create a variable chemistrymarks to store the Chemistry marks
		double chemistrymarks = 96; 
		
		// Create a variable averagemark to calculate the average marks of Sam
		double averagemark = (mathsmarks + physicsmarks + chemistrymarks) / 3;
		
		// Print the average percent mark of Sam in PCM
		System.out.println("Sam's average mark in PCM is " + averagemark);
	}
}
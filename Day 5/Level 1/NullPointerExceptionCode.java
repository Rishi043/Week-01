public class NullPointerExceptionCode {

    public static void generateException() {                          // Method to generate the NullPointerException
	
        String text = null;                                 // Initialize the variable to null
        System.out.println(text.length());                 // This will throw NullPointerException
    }

    public static void handleException() {               // Maling the mthod to handle the NullPointerException
        try {
            String text = null;                          // Initialize the variable to null
            System.out.println(text.length());            // Attempt to access a String method leads to null pointer exception 
        } 
		catch (NullPointerException e) {
            System.out.println("NullPointerException caught using method: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Generating Exception:");
        try {
            generateException(); // Call method to generate the exception
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Handling Exception:"); 
		
        handleException(); // Call method to handle the exception
    }
}

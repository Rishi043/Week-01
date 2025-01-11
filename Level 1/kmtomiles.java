// Creating Class with name kmtomiles to convert kilometers to miles

public class kmtomiles{ 

    public static void main(String args[]){
        
        // Create a variable distanceinkm to store the distance in kilometers
        double distanceinkm = 10.8;
        
        // Create a variable distanceinmiles to convert kilometers to miles
        // Conversion factor: 1 mile = 1.6 km
        double distanceinmiles = 1.6 * distanceinkm;
        
        // Print the converted distance in miles
        System.out.println("The distance " + distanceinkm + " km in miles is " + distanceinmiles); 
    }
}

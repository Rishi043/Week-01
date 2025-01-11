import java.lang.Math;

public class VolumeofEarth {
    public static void main(String args[]){ 
	
	    double radiusinkm = 6378;
		
		// Correct conversion from km to miles
	    double radiusinmiles = 0.621371 * radiusinkm;
		
	    double volcubickm = (4.0/3.0) * Math.PI * Math.pow(radiusinkm, 3);
	
	    double volcubicmiles = (4.0/3.0) * Math.PI * Math.pow(radiusinmiles, 3);

	   
	    System.out.println("The volume of earth in cubic kilometers is " + volcubickm + " and cubic miles is " + volcubicmiles);
	}
}
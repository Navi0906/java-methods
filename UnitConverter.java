import java.util.Scanner;

public class UnitConverter {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3.0; 
        return yards * yardsToFeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333; 
        return feet * feetToYards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701; 
        return meters * metersToInches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254; 
        return inches * inchesToMeters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCm = 2.54; 
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards : ");
        double yards = sc.nextDouble();
        

        System.out.print("Enter feet : ");
        double feet = sc.nextDouble();
        

        System.out.print("Enter meters : ");
        double meters = sc.nextDouble();
        

        System.out.print("Enter inches : ");
        double inches = sc.nextDouble();
        

        System.out.print("Enter inches : ");
        double inchesForCm = sc.nextDouble();
        
		
		//Calling Methods and storing them in a variable
		double feetFromYards = convertYardsToFeet(yards);
		double yardsFromFeet = convertFeetToYards(feet);
		double inchesFromMeters = convertMetersToInches(meters);
		double metersFromInches = convertInchesToMeters(inches);
		double cmFromInches = convertInchesToCentimeters(inchesForCm);
        
        
        
		
		
        System.out.println(yards+" yards is equal to "+feetFromYards +" feet.");
		System.out.println(feet+" feet is equal to "+yardsFromFeet+" yards.");
        System.out.println(meters+" meters is equal to "+inchesFromMeters+" inches.");
		System.out.println(inches+" inches is equal to "+metersFromInches+" meters.");
		System.out.println(inchesForCm+" inches is equal to "+cmFromInches+" centimeters.");
    }
}
import java.util.*;

public class Converter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the kilometers: ");
        double km = sc.nextDouble();
        
		System.out.print("Enter the miles: ");
        double milesInput = sc.nextDouble();
      
		System.out.print("Enter the meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter the feet: ");
        double feetInput = sc.nextDouble();
		
		//Calling all the methods and storing all the conversion
        double kmFromMiles = convertMilesToKm(milesInput);
		double metersFromFeet = convertFeetToMeters(feetInput);
		double miles = convertKmToMiles(km);
		double feet = convertMetersToFeet(meters);
		
        System.out.println(km+" kilometers is equal to "+miles+" miles.");
        System.out.println(miles+" miles is equal to "+kmFromMiles+" kilometers.");
        System.out.println(meters+" meters is equal to "+feet+" feet.");
		System.out.println(feetInput+" feet is equal to "+metersFromFeet+" meters.");

    }
}
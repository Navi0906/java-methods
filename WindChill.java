import java.util.*;
class WindChill{
	//Method calculating wind chill temperature
	public static double calculateWind(double temp, double windSpeed){
		double windChill =  35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);
		
		return windChill;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		double temp = sc.nextDouble();
		System.out.print("Enter the windSpeed: ");
		double windSpeed = sc.nextDouble();
		// Calling the method and displaying the result
		System.out.print("The wind chill temperature is "+calculateWind(temp,windSpeed));
	} 
}
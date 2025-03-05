import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI for each person
    public static void calculateBmi(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; 
            personData[i][2] = weight / (heightInMeters * heightInMeters); 
        }
    }

    // Method to determine BMI status
    public static String[] determineBmiStatus(double[][] personData) {
        String[] weightStatus = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        return weightStatus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = 10; 
        double[][] personData = new double[people][3]; 

        // Loop for taking input for weight and height
        for (int i = 0; i < people; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person
        calculateBmi(personData);

        // Determine BMI status for each person
        String[] weightStatus = determineBmiStatus(personData);
		
		System.out.println();
        for (int i = 0; i < people; i++) {
            System.out.println("Person " + (i + 1) + ": Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }

    }
}
import java.util.Random;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        
        // Validate input for number of students
        while (students <= 0) {
            System.out.print("Invalid Input! Enter the number of students: ");
            students = sc.nextInt();
        }

        // Generate random scores for students
        double[][] scores = generateRandomScores(students);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);
        
        sc.close(); // Close the scanner
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static double[][] generateRandomScores(int students) {
        Random random = new Random();
        double[][] scores = new double[students][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Maths

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Random score between 10 and 99
            scores[i][1] = 10 + random.nextInt(90); // Random score between 10 and 99
            scores[i][2] = 10 + random.nextInt(90); // Random score between 10 and 99
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4]; // [][0] = Total, [][1] = Average, [][2] = Percentage

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100; // Assuming each subject is out of 100

            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f%%\n", 
                (i + 1), 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                results[i][0], 
                results[i][1], 
                results[i][2]);
        }
    }
}
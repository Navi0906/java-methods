import java.util.Scanner;

public class EuclideanEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: "+distance);
        
        // Calculate the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];
        
        // Display the equation of the line
        System.out.printf("Equation of the line: y = %.2fx + %.2f%n", slope, yIntercept);
        
    }

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of the line given two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2]; 
        
        // Calculate the slope (m)
        double slope = (y2 - y1) / (x2 - x1);
        lineEquation[0] = slope; 
        
        // Calculate the y-intercept (b)
        double yIntercept = y1 - (slope * x1);
        lineEquation[1] = yIntercept; 
        
        return lineEquation; 
    }
}
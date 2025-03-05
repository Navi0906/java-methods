import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        
        // Check if the points are collinear using slope method
        boolean areCollinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by slope method: " + areCollinearBySlope);
        
        // Check if the points are collinear using area method
        boolean areCollinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by area method: " + areCollinearByArea);
        
    }

    // Method to check collinearity using slope
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        // Check if slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check collinearity using area of triangle
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area using the formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Check if area is zero
        return area == 0;
    }
}
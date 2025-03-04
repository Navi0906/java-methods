import java.util.Scanner;

class TriangularPark {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed to complete a 5 km run
    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000; 
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the three sides of the triangle
        System.out.print("Enter the length of side 1 : ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter the length of side 2 : ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter the length of side 3 : ");
        double side3 = sc.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);
        
        // Calculate the number of rounds needed to complete a 5 km run
        double rounds = calculateRounds(perimeter);
        
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km in the triangular park.", rounds);
    }
}
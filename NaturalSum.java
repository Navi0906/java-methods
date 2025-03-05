import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        while(n < 1) {
            System.out.println("Please enter a natural number greater than 0: ");
        }

        // Calculate sum using recursion
        int recursiveSum = sumOfNaturalNumbers(n);
        
        // Calculate sum using the formula
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        // Comparing the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods dont give the same result.");
        }

    }

    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + sumOfNaturalNumbers(n - 1); 
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2; 
    }
}
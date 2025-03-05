import java.util.Scanner;

public class Checker {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0; 
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0; 
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; 
        } else if (number1 < number2) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking each number for positive/negative and even/odd
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive. ");
                if (isEven(number)) {
                    System.out.println("It is even.");
                } else {
                    System.out.println("It is odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        // Comparing the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

    }
}
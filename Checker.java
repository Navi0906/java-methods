import java.util.Scanner;

public class Checker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length(); 
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number); 

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10; 
        }
        return digits;
    }

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit; 
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits); 
        return number % sum == 0; 
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; 
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }

        for (int digit : digits) {
            frequency[digit][1]++; 
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        double sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: "+ sumOfSquares);

        // Check if it's a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) { 
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }

    }
}
import java.util.Scanner;

public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; 
            }
        }
        return true; 
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits); 
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if it's a palindrome
        boolean isPalin = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalin);

        // Check if it's a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Compare original and reversed arrays
        boolean arraysEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are original and reversed arrays equal? " + arraysEqual);

    }
}
import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
        return false; 
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power); 
        }
        return sum == number; 
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest; 
                largest = digit; 
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit; 
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest; 
                smallest = digit; 
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit; 
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if it's a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if it's an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number, digits);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest
        int[] largest = findLargest(digits);
        System.out.println("Largest: " + largest[0]);
        System.out.println("Second Largest: " + largest[1]);

        // Find smallest and second smallest
        int[] smallest = findSmallest(digits);
        System.out.println("Smallest: " + smallest[0]);
        System.out.println("Second Smallest: " + smallest[1]);

    }
}
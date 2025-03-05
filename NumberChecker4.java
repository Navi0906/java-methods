import java.util.Scanner;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1]; 
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); 
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; 
        return sum == number; 
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; 
        return sum > number; 
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; 
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10; 
            sum += factorial(digit); 
            temp /= 10; 
        }
        return sum == number; 
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Find sum of factors
        int sumFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumFactors);

        // Find product of factors
        long productFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productFactors);

        // Find product of cubes of factors
        double productCubes = productOfCubesOfFactors(factors);
        System.out.printf("Product of Cubes of Factors: %.2f%n", productCubes);

        // Check if the number is perfect
        boolean perfect = isPerfect(number);
        System.out.println("Is Perfect Number: " + perfect);

        // Check if the number is abundant
        boolean abundant = isAbundant(number);
        System.out.println("Is Abundant Number: " + abundant);

        // Check if the number is deficient
        boolean deficient = isDeficient(number);
        System.out.println("Is Deficient Number: " + deficient);

        // Check if the number is strong
        boolean strong = isStrong(number);
        System.out.println("Is Strong Number: " + strong);

    }
}
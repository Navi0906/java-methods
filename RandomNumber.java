import java.util.Arrays;

public class RandomNumber{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number; 
            min = Math.min(min, number); 
            max = Math.max(max, number); 
        }

        double average = sum / numbers.length; 
        return new double[]{average, min, max}; 
    }

    public static void main(String[] args) {
        int size = 5; 
        int[] randomNumbers = generate4DigitRandomArray(size); 

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: "+ results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
import java.util.Random;

public class FootballTeam{

    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // 101 because we want to include 250
        }
        return heights;
    }

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length; 
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int teamSize = 11; 
        int[] heights = generateRandomHeights(teamSize); 

        // Calculate shortest, tallest, and mean height
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double meanHeight = findMean(heights);

        // Display the results
        System.out.println("Heights of the players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: "+meanHeight+" cm");
    }
}
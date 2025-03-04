import java.util.Scanner;

class Check {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1; // Negative number
        } else if (number > 0) {
            return 1; // Positive number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();
        
        // Call the method to check the number
        int result = checkNumber(userInput);
        
        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
import java.util.Scanner;

class Handshake{

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Invalid Input!");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(number);
            
            
            System.out.println("The maximum number of handshakes among " + number + " students is: " + handshakes);
        }
    }
}
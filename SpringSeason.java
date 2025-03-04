import java.util.*;
public class SpringSeason {

    // Method to check if the date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) {
            return true; 
        } else if (month == 4) {
            return true; 
        } else if (month == 5) {
            return true; 
        } else if (month == 6 && day <= 20) {
            return true; 
        }
        return false; 
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month(1-12): ");
        int month = sc.nextInt();
		System.out.print("Enter the day(1-30): ");
		int day = sc.nextInt();
		
		if (day<1 || day>30 || month<1 || month>12) {
            System.out.println("Invalid Input!");
            return;
        }

        

        // Check if the date is in the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
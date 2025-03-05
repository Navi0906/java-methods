import java.util.Scanner;

public class StudentVote{

    // Method to check if a student can vote based on age
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Displaying whether each student can vote
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

    }
}
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter Year (e.g., 2023): ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(year, month);
        
    }

    static void displayCalendar(int year, int month) {
        // Create a YearMonth object for the specified year and month
        YearMonth yearMonth = YearMonth.of(year, month);
        
        System.out.println();
        System.out.println("Calendar for " + yearMonth.getMonth() + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Get the number of days in the month and the starting day of the month
        int startDay = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        
        // Adjust startDay to match the calendar format (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        startDay = (startDay % 7); 

        // Print leading spaces for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); 
        }

        // Print the days of the month
        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) { 
            System.out.print(day + "   "); 
            if ((day + startDay) % 7 == 0) { 
                System.out.println();
            }
        }
        
        System.out.println(); 
    }
}
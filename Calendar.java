import java.util.Scanner;

public class Calendar {
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS = {31, 28, 31, 30, 31, 30,
                                       31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter Year (e.g., 2023): ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(year, month);
        
    }

    // Method to display the calendar
    static void displayCalendar(int year, int month) {
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int numberOfDays = getNumberOfDays(year, month);
        
        int firstDay = getFirstDayOfMonth(year, month);
        
        System.out.println();
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day); 
            if ((day + firstDay) % 7 == 0) { 
                System.out.println();
            }
        }
        
        System.out.println(); 
    }

    // Method to get the name of the month
    static String getMonthName(int month) {
        return MONTHS[month - 1]; 
    }

    // Method to get the number of days in the month
    static int getNumberOfDays(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29; 
        }
        return DAYS[month - 1]; 
    }

    // Method to check if a year is a leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; 
        return d0; 
    }
}
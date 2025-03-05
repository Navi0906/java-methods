import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a 2D array to store salaries and years of service
        double[][] employeeData = new double[10][2]; 

        populateEmployeeData(employeeData);

        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);

        // Calculate and display the total amounts
        calculateAndDisplayTotals(employeeData, updatedData);
    }

    // Method to populate the employee data with random salaries and years of service
    public static void populateEmployeeData(double[][] employeeData) {
        Random random = new Random();
        for (int i = 0; i < employeeData.length; i++) {
            // Generate a random salary between 10000 and 99999
            employeeData[i][0] = 10000 + (random.nextInt(90000)); // Salary
            // Generate random years of service between 1 and 10
            employeeData[i][1] = 1 + random.nextInt(10); // Years of service
        }
    }

    // Method to calculate new salaries and bonuses
    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; 
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            double newSalary;

            // Calculate bonus and new salary based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }
            newSalary = oldSalary + bonus;

            // Store the old salary, new salary, and bonus in the updated data array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    // Method to calculate and display totals
    public static void calculateAndDisplayTotals(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculate totals
        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        // Display results in a tabular format
        System.out.println("Old Salary      New Salary      Bonus           Years of Service");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.print(updatedData[i][0] + "           ");
            System.out.print(updatedData[i][1] + "           ");
            System.out.print(updatedData[i][2] + "           ");
            System.out.println(employeeData[i][1]);
        }
		System.out.println();
        System.out.print("Total:          " + totalOldSalary + "           " + totalNewSalary);
        System.out.println();
        System.out.print("Total Bonus:    " + totalBonus);
    }
}
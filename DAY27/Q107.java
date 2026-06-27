import java.util.*;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] basicSalary = new double[n];
        double[] netSalary = new double[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < n) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();

                        sc.nextLine(); // Clear input buffer

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Basic Salary: ");
                        basicSalary[count] = sc.nextDouble();

                        // Net Salary = Basic Salary + 20% Bonus
                        netSalary[count] = basicSalary[count] + (basicSalary[count] * 0.20);

                        count++;
                        System.out.println("Salary record added successfully.");
                    } else {
                        System.out.println("Record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No salary records found.");
                    } else {
                        System.out.println("\nID\tName\tBasic Salary\tNet Salary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t" +
                                    basicSalary[i] + "\t\t" + netSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Salary Details");
                            System.out.println("Employee ID: " + empId[i]);
                            System.out.println("Employee Name: " + empName[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("Net Salary: " + netSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}

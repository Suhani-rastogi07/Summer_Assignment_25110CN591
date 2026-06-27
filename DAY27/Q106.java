import java.util.*;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] salary = new double[n];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < n) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();

                        sc.nextLine(); // Clear buffer

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("Employee ID: " + empId[i]);
                            System.out.println("Employee Name: " + empName[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
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

import java.util.*;

public class Q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] empId = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEmployee " + (i + 1));

                        System.out.print("Enter Employee ID: ");
                        empId[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[i] = sc.nextLine();

                        System.out.print("Enter Department: ");
                        department[i] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[i] = sc.nextDouble();
                        sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\nEmployee Details:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("--------------------------");
                        System.out.println("Employee ID : " + empId[i]);
                        System.out.println("Name        : " + empName[i]);
                        System.out.println("Department  : " + department[i]);
                        System.out.println("Salary      : " + salary[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (empName[i].equalsIgnoreCase(search)) {
                            System.out.println("\nEmployee Found!");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Salary      : " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update salary: ");
                    int id = sc.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < n; i++) {
                        if (empId[i] == id) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}

import java.util.*;

public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] roll = new int[n];
        String[] course = new String[n];

        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student Records");
            System.out.println("2. Display Student Records");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nStudent " + (i + 1));

                        System.out.print("Enter Roll Number: ");
                        roll[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        name[i] = sc.nextLine();

                        System.out.print("Enter Course: ");
                        course[i] = sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\nStudent Records:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("--------------------------");
                        System.out.println("Roll Number : " + roll[i]);
                        System.out.println("Name        : " + name[i]);
                        System.out.println("Course      : " + course[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("\nStudent Found!");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Course      : " + course[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}

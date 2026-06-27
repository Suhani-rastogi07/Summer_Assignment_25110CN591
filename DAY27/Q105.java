import java.util.*;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, choice;
        System.out.print("Enter maximum number of students: ");
        n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        int count = 0;

        do {
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < n) {
                        System.out.print("Enter Roll Number: ");
                        roll[count] = sc.nextInt();

                        sc.nextLine(); // Clear buffer

                        System.out.print("Enter Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\nRoll\tName\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("\nStudent Found:");
                            System.out.println("Roll Number: " + roll[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
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
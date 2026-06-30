import java.util.*;

public class Q120{

    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    // Function to add student
    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student record added successfully.");
    }

    // Function to display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nStudent Records");
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Marks   : " + marks[i]);
            System.out.println("--------------------------------");
        }
    }

    // Function to search student
    static void searchStudent() {
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                System.out.println("Student Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student not found.");
    }

    // Function to update marks
    static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks updated successfully.");
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student not found.");
    }

    // Function to delete student
    static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                found = true;
                System.out.println("Record deleted successfully.");
                break;
            }
        }

        if (!found)
            System.out.println("Student not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}
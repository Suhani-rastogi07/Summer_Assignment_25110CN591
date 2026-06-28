import java.util.*;

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String phone = "";
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    if (!name.equals("")) {
                        System.out.println("\nContact Details");
                        System.out.println("Name : " + name);
                        System.out.println("Phone: " + phone);
                    } else {
                        System.out.println("No contact available.");
                    }
                    break;

                case 3:
                    if (!name.equals("")) {
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();
                        System.out.print("Enter New Phone Number: ");
                        phone = sc.nextLine();
                        System.out.println("Contact updated successfully.");
                    } else {
                        System.out.println("No contact available to update.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
import java.util.*;

public class Q109{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int totalBooks = 10;
        int issuedBooks = 0;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Books: " + (totalBooks - issuedBooks));
                    break;

                case 2:
                    if (issuedBooks < totalBooks) {
                        issuedBooks++;
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("No books available.");
                    }
                    break;

                case 3:
                    if (issuedBooks > 0) {
                        issuedBooks--;
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("No books have been issued.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
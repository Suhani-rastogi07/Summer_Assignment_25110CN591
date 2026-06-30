import java.util.*;

public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] title = new String[n];
        String[] author = new String[n];
        boolean[] issued = new boolean[n];

        int choice;

        do {
            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Books");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nBook " + (i + 1));

                        System.out.print("Enter Book Title: ");
                        title[i] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        author[i] = sc.nextLine();

                        issued[i] = false;
                    }
                    break;

                case 2:
                    System.out.println("\nLibrary Books:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("--------------------------");
                        System.out.println("Title  : " + title[i]);
                        System.out.println("Author : " + author[i]);
                        if (issued[i])
                            System.out.println("Status : Issued");
                        else
                            System.out.println("Status : Available");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (title[i].equalsIgnoreCase(search)) {
                            System.out.println("\nBook Found!");
                            System.out.println("Title  : " + title[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title to issue: ");
                    String issueBook = sc.nextLine();
                    boolean issuedBook = false;

                    for (int i = 0; i < n; i++) {
                        if (title[i].equalsIgnoreCase(issueBook)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            issuedBook = true;
                            break;
                        }
                    }

                    if (!issuedBook) {
                        System.out.println("Book not found.");
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

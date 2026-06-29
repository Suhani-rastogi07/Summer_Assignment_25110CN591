import java.util.*;

class Q115 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== STRING MENU =====");
            System.out.println("1. Display String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Find Length");
            System.out.println("5. Reverse String");
            System.out.println("6. Search Character");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("String = " + str);
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    System.out.println("Length = " + str.length());
                    break;

                case 5:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }
                    System.out.println("Reversed String = " + rev);
                    break;

                case 6:
                    System.out.print("Enter character to search: ");
                    char ch = sc.next().charAt(0);

                    int found = 0;
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ch) {
                            System.out.println("Character found at position " + i);
                            found = 1;
                            break;
                        }
                    }

                    if (found == 0)
                        System.out.println("Character not found.");
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);
    }
}

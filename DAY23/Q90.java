import java.util.*;

class Q90 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    System.out.println("First repeating character: " + ch);
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("No repeating character found.");
        }
    }
}

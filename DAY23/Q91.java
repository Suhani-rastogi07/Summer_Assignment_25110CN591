import java.util.*;

class Q91 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are Not Anagrams");
            return;
        }

        boolean anagram = true;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            int count1 = 0, count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch)
                    count1++;
            }

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == ch)
                    count2++;
            }

            if (count1 != count2) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("Strings are Anagrams");
    }
}
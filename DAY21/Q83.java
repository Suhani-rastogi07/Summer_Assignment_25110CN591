import java.util.*;

public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int c=0,d=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch)!=-1)
                c++;
            else
                d++;
        }
        System.out.println("VOWELS ARE="+c);
        System.out.println("CONSONANTS ARE="+d);
    }
}
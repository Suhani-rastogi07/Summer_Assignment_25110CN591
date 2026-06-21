import java.util.*;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str;
        str = sc.nextLine();
        String b="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            b=ch+b;
        }
      System.out.println("Reverse of String is="+b);
    }
}
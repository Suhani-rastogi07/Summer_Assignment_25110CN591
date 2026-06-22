import java.util.*;
class Q87
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter original string");
        String str=sc.nextLine();
        System.out.println("enter frequency of character");
        char d=sc.next().charAt(0);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==d)
            {
               c++;
            }
        }
        System.out.println("Character frequency="+c);
    }
}
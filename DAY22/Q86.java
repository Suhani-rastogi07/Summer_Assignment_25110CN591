import java.util.*;
class Q86
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter original string");
        String str=sc.nextLine();
        int c=1;
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                flag=1;
                c++;
                break;
            }
        }
        System.out.println("Words in a sentence="+c);
    }
}
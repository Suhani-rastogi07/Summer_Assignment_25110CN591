import java.util.*;
class Q88
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter original string");
        String str=sc.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
            if(ch!=' ')
            {
                newstr=newstr+ch;
            }
        }
        System.out.println(newstr);
    }
}

           
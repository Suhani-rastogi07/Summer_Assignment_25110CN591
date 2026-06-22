import java.util.*;
class Q85
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String newstr="";
        System.out.println("enter original string");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            newstr=ch+newstr; 
        }
        int flag=0;
        System.out.println(newstr);
        for(int i=0;i<str.length();i++)
        {
           if(str.equals(newstr))
            flag=1;
            break;
        }
       if(flag==1)
        System.out.println("Palindrome string");
        else
        System.out.println("Non palindrome string");
    }
}

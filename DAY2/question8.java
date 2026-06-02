import java.util.*;
public class question6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int r=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        int num=n;
        while(num!=0)
        {
            int d=num%10;
            r=r*10+d;
            num=num/10;
        }
        if(r==n)
        System.out.println("Palindrome number");
        else
        System.out.println("Not a Palindrome number");
        
    }
}

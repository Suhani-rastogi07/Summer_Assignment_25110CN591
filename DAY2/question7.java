 import java.util.*;
public class question6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int p=1,n;
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        System.out.println("Product of digits ="+p);    
    }
}


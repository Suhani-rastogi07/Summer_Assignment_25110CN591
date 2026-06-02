import java.util.*;
public class question6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int r=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("Reverse of digits ="+r);    
    }
}

    

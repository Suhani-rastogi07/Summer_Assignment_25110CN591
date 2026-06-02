import java.util.*;
class question5
{
    public static void main(String[] args) {
        int s=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum of digits ="+s);    
    }
}

    


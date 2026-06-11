import java.util.*;
class Q43
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean p;
        System.out.println("enter number");
        n=sc.nextInt();
        p=prime(n);
        if(p==true)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
    boolean prime(int m)
    {
        int c=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
                c++;
        }
        if(c==2)
            return true;
         else
            return false;
    }
}


        

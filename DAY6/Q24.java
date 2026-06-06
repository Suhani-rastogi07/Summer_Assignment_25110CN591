import java.util.*;
class Q24
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x,n,p=1;
        System.out.println("enter base number(x)");
        x=sc.nextInt();
        System.out.println("enter power(n)");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            p=p*x;
        }
        System.out.println("x^n is equals to \n"+p);
    }
}



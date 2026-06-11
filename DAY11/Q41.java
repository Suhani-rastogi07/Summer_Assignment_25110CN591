import java.util.*;
class Q41
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        s=sum(a,b);
        System.out.println("Sum of two numbers="+s);
    }
    int sum(int m,int n)
    {
        int c;
        c=m+n;
        return c;
    }
}

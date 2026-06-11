import java.util.*;
class Q44
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,f;
        System.out.println("enter number");
        n=sc.nextInt();
        f=fact(n);
        System.out.println("Factorial of a number is="+f);
    }
    int fact(int m)
    {
       int f=1;
        for(int i=1;i<=m;i++)
        {
            f=f*i;
        }
        return f;
    }
}


        
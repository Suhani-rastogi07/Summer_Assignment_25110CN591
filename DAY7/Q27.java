import java.util.*;
class Q27
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        System.out.println("enter number");
        n=sc.nextInt();
        s=sum(n);
        System.out.println("Sum of digits="+s);
    }
    int sum(int m)
    {
        int d;
        if(m==0)
            return 0;
        else
           d=m%10;
            return d+sum(m/10);
}
}


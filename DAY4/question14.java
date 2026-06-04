import java.util.*;
class question14
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0,i,n;
        System.out.println("enter number");
        n=sc.nextInt();
        if(n==1)
            System.out.println(a);
       else if(n==2)
            System.out.println(b);
        else
        {
        for(i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(c);
    }
    }
}



        
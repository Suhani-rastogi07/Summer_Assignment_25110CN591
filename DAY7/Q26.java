import java.util.*;
class Q26
{
    public  void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,f;
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           f=fibo(i);
          System.out.print(f+"\t");
       }
    }
    int fibo(int m)
    {
        if(m==1)
            return 0;
        else if(m==2)
            return 1;
        else
            return (fibo(m-1)+fibo(m-2));
    }
}

       
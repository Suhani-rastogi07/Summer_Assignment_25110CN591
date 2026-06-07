import java.util.*;
class Q25
{
    public  void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,f;
        System.out.println("enter number");
        n=sc.nextInt();
        f=Fact(n);
        System.out.println("Factorial of a number="+f);
    }
   int Fact(int m)
   {
     if(m==0)
        return 1;
     else
        return m*Fact(m-1);
   }
}


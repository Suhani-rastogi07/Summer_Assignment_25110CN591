import java.util.*;
class Q47
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n=sc.nextInt();
        fibo(n);
     }
    void fibo(int m)
    {
       int a=0,b=1,c,i;
       System.out.print(a+"\t"+b);
       for(i=3;i<=m;i++)
       {
        c=a+b;
        System.out.print("\t"+c+"\t");
        a=b;
        b=c;
       }
       
    }
}

import java.util.*;
class Q21
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        String b="";
        System.out.println("enter number in decimal");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            b=r+b;
            n=n/2;
        }
        System.out.println("binary form of number="+b);
    }
 }
 
 

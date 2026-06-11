import java.util.*;
class Q42
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        max=maximum(a,b);
        System.out.println("Maximum of two numbers="+max);
    }
    int maximum(int m,int n)
    {
        if(m>n)
            return m;
        else
            return n;
    }
 }
 


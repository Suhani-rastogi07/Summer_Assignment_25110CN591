import java.util.*;
class Q46
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean p;
        System.out.println("enter number");
        n=sc.nextInt();
        p=armstrong(n);
        if(p==true)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an armstrong number");
    }
     boolean armstrong(int num)
     {
        int m1=num,c=0,d,s=0;
        while(m1!=0)
        {
            m1=m1/10;
            c++;
        }
        int m2=num;
        while(m2!=0)
        {
            d=m2%10;
            s=s+(int)(Math.pow(d,c));
            m2=m2/10;
        }
        if(num==s)
            return true;
        else 
            return false;
    }
 }
 
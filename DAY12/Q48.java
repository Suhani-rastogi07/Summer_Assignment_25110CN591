import java.util.*;
class Q48
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean p;
        System.out.println("enter number");
        n=sc.nextInt();
        p=perfect(n);
        if(p==true)
         System.out.println("Perfect number");
        else
         System.out.println("Not a perfect number");
    }
    boolean perfect(int m)
    {
        int num=m,c=0,i,s=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            s=s+i;
        }
        System.out.println("Sum is="+s);
        if(m==s)
            return true;
        else 
            return false;
    }
}

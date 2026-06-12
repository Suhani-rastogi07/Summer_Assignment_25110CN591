import java.util.*;
class Q45
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        boolean c;
        System.out.println("enter number");
        n=sc.nextInt();
        c=palindrome(n);
        if(c==true)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
    boolean palindrome(int num)
    {
        int d,r=0,m=num;
         while(m!=0)
         {
            d=m%10;
            r=r*10+d;
            m=m/10;
         }
         if(num==r)
            return true;
        else 
            return false;
    }
}

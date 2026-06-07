import java.util.*;
class Q28
{
    public void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n=sc.nextInt();
        reverse(n);
    }
    void reverse(int m)
    {
        int d;
        if(m==0)
            return;
        else
            d=m%10;
           System.out.print(d);
          reverse(m/10);
    }
    
}
    
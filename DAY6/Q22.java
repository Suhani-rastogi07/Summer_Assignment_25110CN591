import java.util.*;
class Q22
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,c=0;
        double s=0.0;
        System.out.println("enter number in binary");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=s+(r*Math.pow(2,c));
            n=n/10;
            c++;
       }
       System.out.println("Decimal form of number is="+(int)s);
    }
}



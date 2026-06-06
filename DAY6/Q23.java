import java.util.*;
class Q23
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,c=0;
        String b="";
        char d;
        System.out.println("enter number in decimal");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            b=r+b;
            n=n/2;
        }
        for(int i=0;i<b.length();i++)
        {
            d=b.charAt(i);
            if(d=='1')
                c++;
        }
        System.out.println("Number of set bits in number="+c);
    }
}


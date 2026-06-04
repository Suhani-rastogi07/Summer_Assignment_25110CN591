import java.util.*;
class question15
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        int num=n;
        while(num!=0)
        {
            int d=num%10;
            s=s+(d*d*d);
            num=num/10;
        }
        if(s==n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");
       }
}


import java.util.*;
class question17
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
             s=s+i;
        }
        if(s==n)
        System.out.println("It is a perfect number");
        else
        System.out.println("It is not a perfect number");
    }
}




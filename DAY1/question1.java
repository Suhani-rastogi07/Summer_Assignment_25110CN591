import java.util.*;
 class question1
{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    int s=0,n;
    System.out.println("enter number");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        s=s+i;
    }
    System.out.println("Sum of natural numbers is="+s);
} 
}



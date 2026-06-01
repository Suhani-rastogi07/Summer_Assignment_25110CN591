import java.util.*;
public class question3 
{
    public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
      int f=1,n;
       System.out.println("enter number");
       n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           f=f*i;
        System.out.println("Factorial of a number is="+f);
       }
   }
}






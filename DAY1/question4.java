 import java.util.*;
 class question4
{
    public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
      int c=0,n;
       System.out.println("enter number");
       n=sc.nextInt();
       while(n!=0)
       {
           int d=n%10;
           c++;
           n=n/10;
       }
        System.out.println("Digits in a number is="+c);
   
    }
 }


 

    


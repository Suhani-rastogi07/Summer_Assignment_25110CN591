import java.util.*;
class Q50
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        double avg=0.0;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for( int i=0;i<n;i++)
        {
          System.out.println("Enter the elements in array");
          a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           s=s+a[i]; 
        }
        avg=s/n;
         System.out.println("sum is="+s);
         System.out.println("average is="+avg);
        }
    }

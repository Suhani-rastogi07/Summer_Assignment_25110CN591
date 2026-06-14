import java.util.*;
class Q53
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int ns,flag=0;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter number to be searched");
        ns=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(ns==a[i])
            {
             System.err.println(ns+ " element  present at position " +i);               
             flag=1;
             break;
            }
        }
            if(flag==1)
            System.out.println("Search successful");
            else
            System.out.println("Search unsuccessful");
        }
   }
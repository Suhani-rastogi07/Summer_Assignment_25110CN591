import java.util.*;
class Q49
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for( int i=0;i<n;i++)
        {
          System.out.println("Enter the elements in array");
          a[i]=sc.nextInt();
        }
        System.out.println("Elements in an array:");
        for( int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    }
}


import java.util.*;
class Q52
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0,d=0;
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
            if(a[i]%2==0)
                c++;
            else
                d++;
        }
        System.out.println("Even numbers are="+c);
        System.out.println("Odd numbers are="+d);
    }
}


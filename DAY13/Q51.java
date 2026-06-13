import java.util.*;
class Q51
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int max,min;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for( int i=0;i<n;i++)
        {
          System.out.println("Enter the elements in array");
          a[i]=sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
              max=a[i];
            if(a[i]<min)
               min=a[i];
        }
        System.out.println("Largest element is "+max);
        System.out.println("Smallest element is "+min);
    }
}



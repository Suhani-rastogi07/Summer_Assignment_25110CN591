import java.util.*;
class Q55
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int T,smax,i,j;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    T=a[j];
                    a[j]=a[j+1];
                    a[j+1]=T;
                }
            }
        }
        System.out.println("Sorted numbers are=");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        smax=a[0];
        for(i=0;i<n-1;i++)
        {
            if(a[i]>smax)
                smax=a[i];
        }
        System.out.println("Second largest element is="+smax);
    }
}
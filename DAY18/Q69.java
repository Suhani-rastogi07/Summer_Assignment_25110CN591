import java.util.*;
class Q69
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("enter size of array=");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("enter array elements=");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Sorting elements are");
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    int T=A[j];
                    A[j]=A[j+1];
                    A[j+1]=T;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
}
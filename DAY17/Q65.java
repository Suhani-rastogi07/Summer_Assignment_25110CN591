import java.util.*;
class Q65
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("enter size of array");
        int m=sc.nextInt();
        int B[]=new int[m];
        int C[]=new int[n+m];
        System.out.println("Fill A");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Fill B");
        for(int i=0;i<m;i++)
        {
            B[i]=sc.nextInt();
        }
        System.out.println("copying A in C");
        int k=0;
        for(int i=0;i<n;i++)
        {
            C[k]=A[i];
            k++;
        }
        System.out.println("copying B in C");
        for(int i=0;i<m;i++)
        {
            C[k]=B[i];
            k++;
        }
        for(int i=0;i<n+m;i++)
        {
            System.out.println(C[i]);
        }
 
    }
}


import java.util.*;
class Q74
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("enter elements in matrix A");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int B[]=new int[n];
        System.out.println("enter elements in matrix B");
        for(int i=0;i<n;i++)
        {
            B[i]=sc.nextInt();
        }
        int C[]=new int[n];
        for(int i=0;i<n;i++)
        {
           C[i]=A[i]-B[i];
        }
        System.out.println("Subtracting two matrices are");
        for(int i=0;i<n;i++)
        {
        System.out.println(C[i]);
        }
    } 
}

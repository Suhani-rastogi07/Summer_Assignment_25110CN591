import java.util.*;
class Q75
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int R=sc.nextInt();
        System.out.println("enter number of columns");
        int C=sc.nextInt();
        int A[][]=new int[R][C];
        System.out.println("enter elements in matrix A");
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
            A[i][j]=sc.nextInt();
            }
        }
        int B[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                B[j][i]=A[i][j];
            }
        }
        System.out.println("Transpose of matrix is");
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
              System.out.print(B[j][i]+" ");
            }        
        System.out.println();
        }
    } 
}

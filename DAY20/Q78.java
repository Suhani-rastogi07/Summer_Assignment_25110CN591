import java.util.*;
class Q78
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int R=sc.nextInt();
        System.out.println("enter number of columns");
        int C=sc.nextInt();
        int A[][]=new int[R][C];
        int flag=0;
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
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(A[i][j]!=B[i][j])
                    flag=1;
                  break;
            }
        }
        if(flag==0)
            System.out.println("SYMMETRIC MATRIX");
        else
            System.out.println("NOT SYMMETRIC");
    } 
}


import java.util.*;
class Q76
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
        int s=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if((i==j)||((i+j)==(R+C)-1))
                {
                    s=s+A[i][j];
                }
            }
        }
       
       System.out.println(" Sum is " + s);
            }
        }
    

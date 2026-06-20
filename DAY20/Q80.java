import java.util.*;

class Q80
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int R = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int C = sc.nextInt();

        int A[][] = new int[R][C];

        System.out.println("Enter the elements of the matrix:");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column-wise sums are:");

        for(int j = 0; j < C; j++)
        {
            int sum = 0;

            for(int i = 0; i < R; i++)
            {
                sum = sum + A[i][j];
            }

            System.out.println("Sum of column = " + sum);
        }
    }
}

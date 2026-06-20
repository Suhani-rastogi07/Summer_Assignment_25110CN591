import java.util.*;

class Q79
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

        System.out.println("Row-wise sums are:");

        for(int i = 0; i < R; i++)
        {
            int sum = 0;

            for(int j = 0; j < C; j++)
            {
                sum = sum + A[i][j];
            }

            System.out.println("Sum of row = " + sum);
        }
    }
}
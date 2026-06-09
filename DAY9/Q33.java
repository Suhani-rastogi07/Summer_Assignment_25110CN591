import java.util.*;
class Q33
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
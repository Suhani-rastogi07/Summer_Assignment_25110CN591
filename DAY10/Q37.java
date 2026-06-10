import java.util.*;
class Q37
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=10;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i+j<=11)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

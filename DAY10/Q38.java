import java.util.*;
class Q38
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=10;j>=i;j--)
            {
                if(i+j>=11)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

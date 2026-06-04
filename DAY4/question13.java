import java.util.*;
class question13
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,i;
        System.out.print(a+"\t"+b);
        for(i=3;i<=10;i++)
        {
            c=a+b;
            System.out.print("\t"+c+"\t");
            a=b;
            b=c;
        }
    }
}



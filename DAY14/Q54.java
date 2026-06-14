import java.util.*;
class Q54
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int ns,f,c=0;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter number");
        ns=sc.nextInt();
        System.out.println("enter frequency of number");
        f=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           while(ns!=0)
           {
             int d=ns%10;
             if(d==f)
                c++;
             ns=ns/10;
           }
        }
        System.out.println("Frequency of an element is="+c);
    }
}
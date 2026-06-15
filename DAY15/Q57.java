import java.util.*;
class Q57
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
         System.out.println("Reverse array is="); 
        for(int i=n-1;i>=0;i--)
        {
          System.out.println(A[i]);   
        }
    }
}

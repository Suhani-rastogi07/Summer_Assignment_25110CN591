import java.util.*;
class question9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
          System.out.println("Prime number");
        else 
             System.out.println("Not a prime number");
    }   
}
    

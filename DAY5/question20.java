import java.util.*;
class question20
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0,c, n;
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                c=0;
           for(int j=1;j<=i;j++)
           {
            if(i%j==0)
                c++;
           }
        
           if(c==2)
           {   
             max=i;
           }
        }
    }
    System.out.println("Largest prime factor="+max);
}
}




      
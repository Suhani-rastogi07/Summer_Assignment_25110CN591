import java.util.*;
class question18
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,n;
        System.out.println("enter number");
        n=sc.nextInt();
        int num=n;
        while(num!=0)
        {
            int d=num%10;
            int f=1;
             for(int i=1;i<=d;i++)
                {
                   f=f*i; 
                }
                System.out.println("Factorial is="+f);
                s=s+f;
                 num=num/10; 
        } 
        System.out.println("Sum is="+s);
        if(s==n)
        System.out.println("Strong number");
        else
        System.out.println("Not a Strong number");
    }
}
       

        
           

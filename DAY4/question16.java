import java.util.*;
class question15
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,n,c=0;
        System.out.println("enter numbers from 1 to 200");
        n=sc.nextInt();
        int num1=n;
        while(num1!=0)
        {
            int d=num1%10;
            c++;
        }
        int num2=n;
        for(int i=1;i<=200;i++)
        {
        while(num2!=0)
        {
            int d=num2%10;
            s=s+math.pow(d,c);
            num2=num2/10;
        }
    }
        if(s==n)
            System.out.println(i+"is an armstrong number");
    }
}



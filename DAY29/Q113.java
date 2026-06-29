import java.util.*;
class Q113
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int sum,diff,p,div;
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter operator");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':sum=a+b;
                   System.out.println("Addition is="+sum);
                   break;
            case '-':diff=a-b;
                   System.out.println("Subtraction is="+diff);
                   break;
            case '*':p=a*b;
                   System.out.println("Product is="+p);
                   break;
            case '/':div=a/b;
                   System.out.println("Division is="+div);
                   break;
            default:System.out.println("Invalid input");             
                                 
        }
    }
}
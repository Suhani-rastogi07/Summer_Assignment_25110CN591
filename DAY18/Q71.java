import java.util.*;
class Q71
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,mid,flag,beg,end;
        System.out.print("enter size of array=");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("enter array elements=");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("enter number to be searched");
        int ns=sc.nextInt();
        beg=0;
        flag=0;
        end=n-1;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(A[mid]==ns)
            {
            flag=1;
            break;
            }
            else if(A[mid]<ns)
             beg=mid+1;
            else 
            end=mid-1;
          }
        if(flag==1)
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");
    }
}



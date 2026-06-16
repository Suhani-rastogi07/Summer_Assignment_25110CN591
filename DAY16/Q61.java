import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1): ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int n = size + 1;   // Total numbers should be 1 to n
        int totalSum = n * (n + 1) / 2;

        int missing = totalSum - sum;

        System.out.println("Missing number = " + missing);
    }
}

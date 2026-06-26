import java.util.*;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 2) {
            score++;
        }

        System.out.println("\nQ2. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 1) {
            score++;
        }

        System.out.println("\nQ3. How many days are there in a week?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");
    }
 }

import java.util.*;
import java.util.Random;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        int guess = -1; 

        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
    }
}
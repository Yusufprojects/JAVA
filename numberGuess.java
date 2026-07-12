import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        int guess , i = 0 , claim = 5;

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(100);
        boolean situation = false;
        int[] arr = new int[5];

        System.out.println("Welcome to the number guessing game!");

        while (claim > 0) {
            System.out.print("Make a guess between 1 and 100: ");
            guess = input.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100!");
                continue;
            }

            arr[i++] = guess;

            if (guess == number) {
                situation = true;
                break;
            } else {
                claim--;
                if (guess < number) {
                    System.out.println("Hint: Go HIGHER! Remain Claim: " + claim);
                } else {
                    System.out.println("Hint: Go LOWER! Remain Claim: " + claim);
                }
            }
        }
        System.out.println("\n--- GAME OVER ---");
        if (situation) {
            System.out.println("Congratulations! You guessed it!");
            System.out.println("The Number was: " + number + " | Remaining Claims: " + claim);
        } else {
            System.out.println("Your claims have been exhausted! You lost.");
            System.out.println("The Correct Number was: " + number);
        }
        System.out.print("Your entered numbers: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

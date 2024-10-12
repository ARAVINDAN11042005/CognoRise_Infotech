import java.util.Random;
import java.util.Scanner;

public class NumberGuessGames {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomnumber = rand.nextInt(100) + 1;
        int trycount = 0;
        while (true) {
            System.out.println("Enter your Guess(1-100):");
            int playerGuess = sc.nextInt();
            trycount++;
            if (playerGuess == randomnumber) {
                System.out.println("Correct! You Win.");
                System.out.println("you took " + trycount + " tries");
                break;
            } else if (randomnumber > playerGuess) {
                System.out.println("Nope! the number is Higher. guess again.");
            } else {
                System.out.println("Nope! the number is Lower. guess again.");
            }
        }
        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] arg){
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int input;
        int guessSum = 1;
        int gameRandom = random.nextInt(100) + 1;
        boolean guessed = false;

        while(!guessed) {
            System.out.println("Guess a number between 1 and 100:");
            input = keyboard.nextInt();

            if(input == gameRandom) {
                System.out.println("Congratulation you guessed the number after: " +
                        guessSum + " tries.");
                        guessed = true;
            } else if(input > 100 || input < 1) {
                System.out.println("Did you just wasted a guess? I said between 1 and 100!");
                guessSum++;
            } else if(input > gameRandom) {
                System.out.println("Too high!");
                guessSum++;
            } else if(input < gameRandom) {
                System.out.println("Too low!");
                guessSum++;
            }
        }


    }
}

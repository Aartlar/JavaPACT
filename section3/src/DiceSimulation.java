import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int dice;

        System.out.println("Now rolling begins");

        for(int i = 1; i <= 10; i++) {
            dice = random.nextInt(6) + 1;

            System.out.println("Dice " + i + ": " + dice);
        }
    }
}

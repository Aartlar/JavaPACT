import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);

            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");

    }
}

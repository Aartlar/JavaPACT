import java.util.Scanner;

public class SumFun {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input;

        do {
            System.out.println("Provide a positive number");
            System.out.println("Or negative to end the loop");
            input = keyboard.nextInt();

            sum += input;
        } while(input > 0);

        System.out.println("Sum of the number is: " + sum);

    }
}

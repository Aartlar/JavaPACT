import java.util.Scanner;

public class Proj2_1_AvgOfTree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double numbers;

        System.out.println("Provide three numbers");
        numbers = keyboard.nextDouble();
        numbers += keyboard.nextDouble();
        numbers += keyboard.nextDouble();

        System.out.println("Average of three provided numbers: " + numbers / 3);
    }
}

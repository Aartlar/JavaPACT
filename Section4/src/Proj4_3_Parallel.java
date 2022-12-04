import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] name = new String[5];
        int[] age = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Specify a name: ");
            name[i] = keyboard.next();
            System.out.print("Specify an age: ");
            age[i] = keyboard.nextInt();
        }

        for(int j = 0; j < 5; j++) {
            System.out.println(name[j] + " is " + age[j] + " years old.");
        }

    }
}

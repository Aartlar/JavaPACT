import java.util.Scanner;

public class Proj5_1_NamePermutation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] fullNames = new String[5];

        for(int i = 0; i < 5; i++ ) {
            System.out.print("Provide an FullName: \t");
            fullNames[i] = keyboard.nextLine();
        }

        for(String i : fullNames) {

            for(String j : fullNames) {

                System.out.println(
                        i.substring(0 ,i.indexOf(' ') ) + j.substring(j.indexOf(' ')));

            }
        }
    }
}
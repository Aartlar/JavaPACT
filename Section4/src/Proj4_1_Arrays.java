import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] sysArray = new int[5];
        int sum;

        for(int i = 0; i < sysArray.length; i++) {
            System.out.print("Provide a integer : \t");
            sysArray[i] = keyboard.nextInt();
        }

        for (int i : sysArray) {
            sum = i * 2;
            System.out.println(sum);
        }
    }
}

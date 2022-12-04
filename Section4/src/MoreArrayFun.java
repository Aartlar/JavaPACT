import java.util.Scanner;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        Scanner kayboard = new Scanner(System.in);
        myArray = new int[10];

        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = kayboard.nextInt();
        }

        for(int j : myArray) {
            System.out.println(myArray[j]);
        }
    }
}

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];

        fill2DArray(my2DArray);
        print2DArray(my2DArray);

        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }


    public static void fill2DArray(int[][] twoDArray) {
        Random random = new Random();

        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray.length; j++) {
                twoDArray[i][j] = random.nextInt(100);
            }
        }
    }

    public static void print2DArray(int[][] twpDArray) {
        for(int[] arr : twpDArray) {
            for (int num : arr) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArray) {
        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray.length; j++) {
                twoDArray[i][j] *= 2;
            }
        }
    }
}
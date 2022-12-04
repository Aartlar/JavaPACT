import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();
        int sizeOfList;
        Double temp;
        boolean condition = true;

        while (condition) {
            System.out.println("Provide a number 0 or above. Negative will break the loop");
            temp = keyboard.nextDouble();
            if(temp >= 0 ) {
                myList.add(temp);
            } else {
                condition = false;
            }
        }

        sizeOfList = myList.size();

        for(int i = sizeOfList - 1 ; i >= 0; i--) {
            System.out.println(myList.get(i));
        }

    }
}

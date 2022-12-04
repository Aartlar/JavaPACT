import java.util.ArrayList;
import java.util.Random;

public class Proj6_1_SumOFElements {
    public static void main(String[] args) {
        Random random = new Random();
        int newRandom = random.nextInt(100);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < newRandom; i++){
            arrayList.add(random.nextInt(100));
        }

        System.out.println(sumElements(arrayList));
    }

    public static int sumElements(ArrayList<Integer> list) {
        int result = 0;

        for(int i : list) {
            result += i;
        }
        return result;
    }
}

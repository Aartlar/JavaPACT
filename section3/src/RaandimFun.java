import java.util.Random;

public class RaandimFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("namber is: " + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("namber is: " + myRandomNumber);
    }
}

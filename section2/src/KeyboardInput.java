import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double rNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("Whats ur age");
        age = keyboard.nextInt();

        System.out.println("Provide a real number");
        rNumber = keyboard.nextInt() * 2;
        keyboard.nextLine();

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is " + age);
        System.out.println("city is " + city);
        System.out.println("Ur number is fallowing: " + rNumber);
    }
}

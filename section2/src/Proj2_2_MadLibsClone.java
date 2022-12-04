import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        String story[] = new String[11];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Provide Adjective");
        story[0] = keyboard.nextLine();
        System.out.println("Provide Girls_name");
        story[1] = keyboard.nextLine();
        System.out.println("Provide Adjective2");
        story[2] = keyboard.nextLine();
        System.out.println("Provide Ocupation1");
        story[3] = keyboard.nextLine();
        System.out.println("Provide Place");
        story[4] = keyboard.nextLine();
        System.out.println("Provide Clothing");
        story[5] = keyboard.nextLine();
        System.out.println("Provide Hobby");
        story[6] = keyboard.nextLine();
        System.out.println("Provide Adjective3");
        story[7] = keyboard.nextLine();
        System.out.println("Provide Occupation2");
        story[8] = keyboard.nextLine();
        System.out.println("Provide Boy_name");
        story[9] = keyboard.nextLine();
        System.out.println("Provide Mans_name");
        story[10] = keyboard.nextLine();

        System.out.println("There once was a " + story[0] +
                " girl named " + story[1] +
                ", who was a " + story[2] + " " + story[3] +
                " in the Kingdom of " + story[4] + ". " +
                "She loved to wear " + story[5] + " and to " + story[6] + ". " +
                "She wanted to marry the " + story[7] + " " + story[8] +
                " named " + story[9] + " but her father, King " + story[10] +
                " forbid her from seeing him.");

    }
}

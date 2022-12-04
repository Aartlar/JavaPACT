import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        int blankPlace;
        String firstName;
        String lastName;

        System.out.print("Provide us your full name: \t");
        fullName = keyboard.nextLine();

        blankPlace = fullName.indexOf(' ');
        firstName = fullName.substring(0,blankPlace).toUpperCase();
        lastName = fullName.substring(blankPlace + 1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);
    }
}

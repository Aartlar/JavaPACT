import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFile {
    public static void main(String[] args) {
        Scanner infile;

        /*
        try {
            infile = new Scanner(new File("input.txt"));
            int input;

            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }

            infile.close();
        }
         */

        try {
            infile = new Scanner(new File("input.txt"));
            int sumTheNum = 0;

            while(infile.hasNext()) { sumTheNum += infile.nextInt(); }
            System.out.println("Sum is: " + sumTheNum);

            infile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex) {
            System.out.println("Error reading input!");
        }


    }
}

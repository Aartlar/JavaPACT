import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutputFun {
    public static void main(String[] args) {

        /*
        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there");
            pw.println("My name is Przemyslaw");
            pw.close();
        }
         */

        ArrayList<String> names = new ArrayList<>();

        names.add("Przemek");
        names.add("Danuta");
        names.add("Wieslaw");
        names.add("Karol");
        names.add("Okon");

        try {
            PrintWriter nW = new PrintWriter("names.txt");

            for(String i : names) {
                nW.println(i);
            }

            nW.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't write to the file!");
        }
    }
}

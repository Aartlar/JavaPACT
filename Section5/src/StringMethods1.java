public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baught";
        String name1 = "John Baught";
        String name2 = "Rob Percival";
        String myName = "Przemyslaw Tluszcz";

        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();

        if(name.equals(name1)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names aren't equal.");
        }

        if(name.compareTo(name2) > 0) {
            System.out.println("name > name2");
        } else {
            System.out.println("name <= name2");
        }

        for(int i = 0; i < myName.length(); i++) {
            System.out.print(myName.charAt(i) + " ");
        }

        System.out.println();

        if(myName.equals(name1)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names aren't equal.");
        }

        if(myName.compareTo(name2) > 0) {
            System.out.println("myName > name2");
        } else {
            System.out.println("myName <= name2");
        }

    }
}

public class RelationalFun {
    public static void main(String[] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 26;
        boolean a22 = currentAge >= 21;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        boolean ageComparison = myAge > yourAge;

        System.out.println("myArgs > yourAge? " + ageComparison );

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;

        System.out.println("yourAge == bobsAge?: " + ageComparison);
        System.out.println("currentAge >= 21?: " + a22);
    }
}

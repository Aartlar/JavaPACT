public class MethodsDemo {

    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        double result1;
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        result1 = sqrRoot(2.1);
        System.out.println(result1);
    }

    // Void, parameterless method
    public static void printHello() {
        System.out.println("Hello there!");
    }

    // Void, parameterized method
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }

    // Value-returning, parameterless method
    public static int giveMe10() {
        return 10;
    }

    // Value-returning, parameterized method
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    // My method
    public static double sqrRoot(double a) {
        return a * a;
    }

}

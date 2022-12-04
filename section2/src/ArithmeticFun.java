public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("result is " + result);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("reminder is " + remainder);

        result += 20;
        System.out.println("result is now " + result);

        result++;
        System.out.println("result is now " + result);

        result--;
        System.out.println("result is now " + result);

        product *= 2;
        System.out.println("product is now " + product);
    }
}

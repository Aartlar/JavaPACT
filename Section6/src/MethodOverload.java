public class MethodOverload {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);

        String result1 = getResult("2", "4");
        System.out.println(result1);
    }

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num, String value) {
        return num * Integer.parseInt(value);
    }

    public static String getResult(String value, String value1) {
        return value + " " + value1;
    }
}

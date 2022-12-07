public class P3_CircleDemo {
    public static void main(String[] args) {
        P3_Circle unitCircle = new P3_Circle();
        P3_Circle myCircle = new P3_Circle(5);
        P3_Circle yourCircle = new P3_Circle(12.75);

        printCircleData(unitCircle);
        printCircleData(myCircle);
        printCircleData(yourCircle);
    }

    public static void printCircleData(P3_Circle circle) {
        System.out.println("r = " + circle.getRadius());
        System.out.println("C = " + String.format("%.2f",circle.circumference()));
        System.out.println("A = " + String.format("%.2f",circle.area()));
        System.out.println();
    }

}

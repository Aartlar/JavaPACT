public class P7_2_IceCreamDemo {
    public static void main(String[] args) {
        P7_2_IceCream myIC = new P7_2_IceCream("Chocolate", 3, 2);
        P7_2_IceCream yourIC = new P7_2_IceCream("Strawberry", 2, 1);

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("sprinkles");

        printIC(myIC);
        printIC(yourIC);
    }

    public static void printIC(P7_2_IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $" + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();
    }
}

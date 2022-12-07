import java.util.ArrayList;

public class P7_2_IceCream {

    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings = new ArrayList<>();

    public P7_2_IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings() {
        for(String i : toppings) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

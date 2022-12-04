import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String agreement;
        int packageNmber;
        int totalCourses;
        int additionalCourses;
        int additionalCost = 0;
        int baseCost = 0;
        int sum;

        System.out.println("Welcome user, today we'll be trying to scam you on courses:");
        System.out.println("Although we want to scam you, we will do it as transparent \n" +
                "as possible.");
        System.out.println("Your options are fallowing:");
        System.out.println("Package #1:");
        System.out.println("* 10€/month, includes 2 courses");
        System.out.println("* Every additional course cost 6€");
        System.out.println("Package #2:");
        System.out.println("* 12€/month, includes 4 courses");
        System.out.println("* Every additional course cost 4€");
        System.out.println("Package #3:");
        System.out.println("* 15€/month, includes 6 courses");
        System.out.println("* Every additional course cost 3€");
        System.out.println("DO YOU AGREE? Y/N");
        agreement = keyboard.next();

        if(agreement.equals("Y") || agreement.equals("y")) {

            System.out.println("Which package has you decided to get? 1,2 or 3");
            packageNmber = keyboard.nextInt();

            System.out.println("How many courser per month in total would you like?");
            totalCourses = keyboard.nextInt();

            additionalCourses = totalCourses - (packageNmber * 2);

            switch (packageNmber) {
                case 1 -> {
                    baseCost = 10;
                    additionalCost = 6;
                }
                case 2 -> {
                    baseCost = 12;
                    additionalCost = 4;
                }
                case 3 -> {
                    baseCost = 15;
                    additionalCost = 3;
                }
                default -> {
                    System.out.println("Something went wrong try again:");
                    System.out.println("Which package has you decided to get? 1,2 or 3");
                    packageNmber = keyboard.nextInt();
                }
            }

            sum = baseCost + additionalCourses * additionalCost;

            System.out.println("Total cost of your membership is: " + sum + "€.");

        } else if(agreement.equals("N") || agreement.equals("n")) {} else {
            System.out.println("Invalid input, try again:");
            System.out.println("DO YOU AGREE? Y/N");
            agreement = keyboard.next();
        }

        System.out.println("Thank you for visiting us.");

    }
}

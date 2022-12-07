public class Proj1_BankAccountDemo {
    public static void main(String[] args) {
        Proj1_BankAccount todsAccount = new Proj1_BankAccount("Tod");
        Proj1_BankAccount Natalie = new Proj1_BankAccount("Natalie", 100);

        todsAccount.deposit(500);


        todsAccount.withdraw(1000);
        System.out.println("owner: " + todsAccount.getOwner());
        System.out.println("balance: " + todsAccount.getBalance());
        System.out.println();

        System.out.println("owner: " + Natalie.getOwner());
        System.out.println("balance: " + Natalie.getBalance());
        System.out.println();

        System.out.println("Deposit 1000?");
        Natalie.deposit(1000);

        System.out.println("owner: " + Natalie.getOwner());
        System.out.println("balance: " + Natalie.getBalance());
        System.out.println();
    }
}

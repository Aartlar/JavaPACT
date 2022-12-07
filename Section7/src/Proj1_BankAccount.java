public class Proj1_BankAccount {
    private String owner;
    private int balance;

    public Proj1_BankAccount(String owner) {
        this(owner, 0);
    }

    public Proj1_BankAccount(String owner, int balance) {
            this.owner = owner;
            if(balance >= 0) {
                this.balance = balance;
            } else {
                System.out.println("Balance must be greater than 0");
            }
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds");
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}

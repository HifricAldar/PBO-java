package SIBank;

public class Account {
    protected double balance;

    public Account(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        System.out.println("deposit: "+amount);
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        System.out.println("withdraw: "+ amount);
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}

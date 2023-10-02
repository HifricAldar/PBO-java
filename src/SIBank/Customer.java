package SIBank;

public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        if (numberOfAccounts < 5) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    public Account getAccount(int account_index) {
        return accounts[account_index];
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
    public void display() {
        System.out.println("===== Customer Information =====");
        System.out.println("Customer Name: " + firstName + " " + lastName);
        System.out.println("Number of Accounts: " + numberOfAccounts);

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("----- Account " + (i + 1) + " -----");
            System.out.println("Account Balance: " + accounts[i].getBalance());
        }
    }
}

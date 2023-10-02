package SIBank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Hifric", "Aldar");
        Customer customer = bank.getCustomer(0);
        Account account = new Account(1000.0);
        customer.setAccount(account);
        customer.display();

        boolean depositSuccess = account.deposit(500.0);
        if (depositSuccess) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit failed. Amount must be greater than 0.");
        }

        boolean withdrawSuccess = account.withdraw(200.0);
        if (withdrawSuccess) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }

        System.out.println("Updated Balance: " + account.getBalance());

    }
}

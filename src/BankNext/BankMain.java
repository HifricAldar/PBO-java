package BankNext;

public class BankMain {
    public static void main(String[] args) {
        Bank<Integer> bank = new Bank<>("BRI");

        Customer<Integer> customer = new Customer<>("Hifric", "Aldar");

        customer.addAccount(new Account<>(1, "06-06-2023"));
        customer.addAccount(new Account<>(2, "23-12-2023"));
        customer.addAccount(new Account<>(3, "11-09-2023"));
        customer.addAccount(new Account<>(4, "26-02-2023"));
        customer.addAccount(new Account<>(5, "30-08-2023"));

        bank.addCustomer(customer);

        System.out.println("Nama Bank: " + bank.getBankName());
        System.out.println("Jumlah Pelanggan: " + bank.getNumOfCustomers());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer<Integer> currentCustomer = bank.getCustomer(i);
            System.out.println(
                    "Nama Pelanggan: " + bank.getCustomer(i).getFirstName() + " " + currentCustomer.getLastName());
            System.out.println("Jumlah Akun: " + bank.getCustomer(i).getNumOfAccounts());

            for (int j = 0; j < currentCustomer.getNumOfAccounts(); j++) {
                Account<Integer> currentAccount = currentCustomer.getAccount(j);
                System.out.println("ID Akun: " + currentAccount.getId());
                System.out.println("Tanggal Pembuatan Akun: " + currentAccount.getDate());
            }
        }
    }
}

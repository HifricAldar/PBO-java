package Bank;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: " + bank.getSaldo());

        System.out.println();
        System.out.println("Simpan uang: "+ bank.simpanUang(500000));
        System.out.println("Saldo saat ini: " + bank.getSaldo());
        System.out.println();
        System.out.println("Simpan uang: "+ bank.ambilUang(150000));
        System.out.println("Saldo saat ini: " + bank.getSaldo());

    }
}

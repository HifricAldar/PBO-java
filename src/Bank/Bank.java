package Bank;

public class Bank {
    int saldo;
    Bank(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public int simpanUang(int simpan){
        saldo = saldo+simpan;
        return simpan;
    }
    public int ambilUang(int ambil){
        if(saldo<ambil){
            System.out.println("saldo tidak cukup");
        }else{
            saldo = saldo-ambil;
        }
        return ambil;
    }

}

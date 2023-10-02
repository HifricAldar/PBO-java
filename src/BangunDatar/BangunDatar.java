package BangunDatar;

public class BangunDatar {
    int sisi;
    int panjang;
    int lebar;
    //no args constructor
    BangunDatar(){
        
    }
    
    public BangunDatar(int sisi){
        this.sisi = sisi;
    }
    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //mutator
    public void setValueSisi(int sisi){
        this.sisi = sisi;
    }
    public void setValuesPanjangdanLebar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //assesor
    public int getSisi(){
        return sisi;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public double hitungLuasPersegi(){
        double hasil = Math.pow(sisi, 2);
        return hasil;
    }
    public int hitungLuasPersegiPanjang(){
        int hasil = panjang * lebar;
        return hasil;
    }
    public int hitungKelilingPersegi(){
        int hasil = 4 * sisi;
        return hasil;
    }
    public int hitungKelilingPersegiPanjang(){
        int hasil = 2 * (panjang+lebar);
        return hasil;
    }

    
}

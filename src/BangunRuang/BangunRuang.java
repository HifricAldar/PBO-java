package BangunRuang;
public class BangunRuang {
    int sisi;
    float jarijari;
    int panjang;
    int lebar;
    int tinggi;
    BangunRuang(){

    }
    BangunRuang(int sisi){
        this.sisi = sisi;
    }
    BangunRuang(float jarijari){
        this.jarijari = jarijari;
    }
    BangunRuang(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    //assesor
    public int getSisi(){
        return sisi;
    }
    public float getJarijari(){
        return jarijari;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public int getTinggi() {
        return tinggi;
    }

    //mutator
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public void setJarijari(float jarijari){
        this.jarijari = jarijari;
    }
    public void setValues(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
         this.tinggi = tinggi;
    }

    public int hitungLuasKubus(){
        int luas = 6*(sisi*sisi);
        return luas;
    }
    public int hitungLuasBalok(){
        int luas = 2*((panjang*lebar)+(panjang*tinggi)+ (tinggi*lebar));
        return luas;
    }
    public double hitungLuasBola(){
        double pi = 3.14159265358979323846;
        double luas = 4*pi*Math.pow(jarijari, 2);
        return luas;
    }
    public double hitungVolumeKubus(){
        double volume = Math.pow(sisi, 3);
        return volume;
    }
    public int hitungVolumeBalok(){
        int volume = panjang*lebar*tinggi;
        return volume;
    }
    public double hitungVolumeBola(){
        double pi = 3.14159265358979323846;
        double volume = 4/3*pi*Math.pow(jarijari, 3);
        return volume;

    }


}

package BangunRuang;
public class BangunRuangBeraksi {
    public static void main(String[] args) {
        BangunRuang kubus = new BangunRuang(10);
        BangunRuang balok = new BangunRuang();
        BangunRuang balok2 = new BangunRuang(5, 15, 7);
        BangunRuang bola = new BangunRuang(5);

        System.out.println("luas kubus dengan ukuran sisi "+ kubus.getSisi()+ " adalah "+kubus.hitungLuasKubus());
        System.out.println("volume kubus dengan ukuran sisi "+ kubus.getSisi()+ " adalah "+kubus.hitungVolumeKubus());

        System.out.println("luas balok dengan ukuran panjang, lebar, tinggi "+ balok.getPanjang()+", "+balok.getLebar()+", "+balok.getTinggi()+ " adalah "+balok.hitungLuasBalok());
        System.out.println("volume balok dengan ukuran panjang, lebar, tinggi "+ balok.getPanjang()+", "+balok.getLebar()+", "+balok.getTinggi()+ " adalah "+balok.hitungVolumeBalok());
        
        System.out.println("luas balok dengan ukuran panjang, lebar, tinggi "+ balok2.getPanjang()+", "+balok2.getLebar()+", "+balok2.getTinggi()+ " adalah "+balok2.hitungLuasBalok());
        System.out.println("volume balok dengan ukuran panjang, lebar, tinggi "+ balok2.getPanjang()+", "+balok2.getLebar()+", "+balok2.getTinggi()+ " adalah "+balok2.hitungVolumeBalok());

        System.out.println("luas bola dengan ukuran jari-jari "+ bola.getJarijari()+ " adalah "+bola.hitungLuasBola());
        System.out.println("volume bola dengan ukuran jari-jari "+ bola.getJarijari()+ " adalah "+bola.hitungVolumeBola());
    }
}

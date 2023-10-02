package rumahayah;
public class Main {
    public static void main(String[] args) {
        Rumah akbarHome = new Rumah(50000l, 36);
        Rumah bambangHome = new Rumah(100000l, 45);
        Rumah charlieHome = new Rumah(700000L, 47);

        Ayah akbar = new Ayah("akbar", akbarHome);
        Ayah bambang = new Ayah("bambang", bambangHome);
        Ayah charlie = new Ayah("charlie", charlieHome);

        akbar.DisplayAyahPBB();
        bambang.DisplayAyahPBB();
        charlie.DisplayAyahPBB();


    }
}

package rumahayah;
public class Ayah{
    private String name;
    private Rumah home;
    Ayah(String name, Rumah home){
        this.name = name;
        this.home = home;
    }

    public void DisplayAyahPBB(){
        System.out.println( "Ayah " + name + " memiliki rumah tipe "+ home.getHomeType()+ " dengan harga PBB "+ home.calculatePBB());
    }

}
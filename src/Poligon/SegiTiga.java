package Poligon;

public class SegiTiga extends Poligon{
    int alas;
    int tinggi;
    double miring;

    SegiTiga(){

    }
    SegiTiga(int num_side,String name,String color, int alas, int tinggi, int miring){
        super(num_side, name, color);
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
    }
    public void setSegiTigaHeight(int tinggi){
        this.tinggi = tinggi;
    }
    public void setSegiTigaAlas(int alas){
        this.alas = alas;
    }
    public void setSegiTigaMiring(double miring){
        this.miring = miring;
    }
    
    public int getSegiTigaHeight(){
        return tinggi;
    }
    public int getSegiTigaAlas(){
        return alas;
    }
    public double getSegiTigaMiring(){
        return miring;
    }

    public double hitungKelilingSegiTiga(){
        double hasil = alas+tinggi+miring;
        return hasil;
    }
    public double hitungLuasSegiTiga(){
        double hasil = 0.5*alas*tinggi;
        return hasil;
    }
    public void Display(){
        super.Display();
        System.out.println(" dengan alas "+getSegiTigaAlas()+", tinggi "+getSegiTigaHeight()+ " dan sisi miring "+getSegiTigaMiring());
        System.out.println(" memiliki keliling: "+hitungKelilingSegiTiga()+", Luas: "+hitungLuasSegiTiga());

    }

}

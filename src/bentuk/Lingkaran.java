package bentuk;
public class Lingkaran extends Bentuk{
    double radius;
    double pi = 3.14159265358979323846;

    Lingkaran(){

    }
    Lingkaran(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double hitungLuas(){
        double hasil = pi * Math.pow(radius, 2);
        return hasil;
    }
    public void Display(){
        System.out.print("Lingkaran ");
        super.Display();
        System.out.println("dengan panjang jari-jari "+getRadius()+" memiliki luas = "+(int)hitungLuas());
    }
}

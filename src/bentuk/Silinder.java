package bentuk;

public class Silinder extends Lingkaran{
    int height;
    Silinder(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double hitungVolume(){
        double hasil = hitungLuas() * height;
        return hasil;
    }
    public void Display(){
        System.out.println("Silinder berwarna"+"["+getColor()+"]"+" dengan panjang jari-jari "+getRadius()+" dan tinggi " +getHeight()+ " memiliki Volume = "+hitungVolume());
    }



}

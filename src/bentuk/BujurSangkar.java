package bentuk;

public  class BujurSangkar extends Bentuk{
    double side;
    BujurSangkar(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double hitungLuas(){
        double hasil = Math.pow(side, 2);
        return hasil;
    }
    public String Display(){
        return "Bujur Sangkar "+super.Display()+" dengan panjang sisi "+getSide()+" memiliki luas = "+(int)hitungLuas();
    }
}

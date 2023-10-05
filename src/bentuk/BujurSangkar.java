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
    public void Display(){
        System.out.print("Bujur Sangkar ");
        super.Display();
        System.out.println("dengan panjang sisi "+getSide()+" memiliki luas = "+(int)hitungLuas());
    }
}

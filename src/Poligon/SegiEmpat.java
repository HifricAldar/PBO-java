package Poligon;

public class SegiEmpat extends Poligon {
    int lenght;
    int width;

    SegiEmpat(int num_side, String name, String color, int lenght, int width){
        super(num_side, name, color);
        this.lenght = lenght;
        this.width = width;
    }
    public void setSegiEmpatLenght(int lenght){
        this.lenght = lenght;
    }
    public void setSegiEmpatWidth(int width){
        this.width = width;
    }
    public int getSegiEmpatLenght(){
        return lenght;
    }
    public int getSegiEmpatwidth(){
        return width;
    }
    public int hitungKelilingSegiEmpat(){
        int hasil = 2*(lenght+width);
        return hasil;
    }
    public void Display(){
        super.Display();
        System.out.println(" dengan panjang "+getSegiEmpatLenght()+ " dan lebar "+getSegiEmpatwidth()+" memiliki keliling: "+hitungKelilingSegiEmpat());

    }


    

}

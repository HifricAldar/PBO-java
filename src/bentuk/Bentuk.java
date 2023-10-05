package bentuk;

public class Bentuk {
    String color;
    Bentuk(){

    }
    Bentuk(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void Display(){
        System.out.print("Berwarna" + "[" + color + "]");
    }
}

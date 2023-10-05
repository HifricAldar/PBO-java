package Poligon;

public class Poligon {
    int num_side;
    String name;
    String color;
    Poligon(){

    }
    Poligon(int num_side, String name, String color){
        this.num_side = num_side;
        this.name = name;
        this.color = color;
    }
    public void setPolygonName(String name){
        this.name = name;
    }
    public void setPolygonColor(String color){
        this.color = color;
    }
    public void setPolygonNum_Side(int num_side){
        this.num_side = num_side;
    }

    public String getPolygonName(){
        return name;
    }
     public String getPolygonColor(){
        return color;
    }
     public int getPolygonNum_side(){
        return num_side;
    }

    public void Display(){
        System.out.print("Poligon "+ getPolygonName()+" berwarna "+getPolygonColor()+" memiliki jumlah sisi "+ getPolygonNum_side());
    }


    
}

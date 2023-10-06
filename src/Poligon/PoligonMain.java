package Poligon;

public class PoligonMain {
    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat(4, "Segi Empat", "merah", 10, 6);
        se.Display();

        System.out.println();
        SegiTiga sg = new SegiTiga(3, "segitiga", "biru", 5, 6, 8);
        sg.Display();
    }
}

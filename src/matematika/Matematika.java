package matematika;

public class Matematika {
    int a;
    int b;

    public void setNumber(int a, int b){
        this.a = a;
        this.b = b;
    }


    public int getNumberA(){
        return a;
    }
    public int getNumberB(){
        return b;
    }
    public int pertambahan(){
        int hasil = a+b;
        return hasil;

    }
    public int pengurangan(){
        int hasil = a-b;
        return hasil;
    }
    public int perkalian(){
        int hasil = a*b;
        return hasil;
    }
    public double pembagian(){
        double hasil = a/b;
        return hasil;
    }
}

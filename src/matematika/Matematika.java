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
    public void Display(){
        System.out.println("pertambahan: "+getNumberA()+" + "+getNumberB()+" = "+ pertambahan());
        System.out.println("pengurangan: "+getNumberA()+" - "+getNumberB()+" = "+ pengurangan());
        System.out.println("perkalian: "+getNumberA()+" * "+getNumberB()+" = "+ perkalian());
        System.out.println("pembagian: "+getNumberA()+" / "+getNumberB()+" = "+ pembagian());
    }
}

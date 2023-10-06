package matematika;
public class MatematikaCanggih extends Matematika {
    public int modulus(){
        int hasil = a%b;
        return hasil;
    }
    public void Display(){
        super.Display();
        System.out.println("Modulus: "+getNumberA()+" % "+getNumberB()+" = "+ modulus());
    }
}

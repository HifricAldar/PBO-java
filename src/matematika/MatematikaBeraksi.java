package matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        System.out.println("Class Matematika");
        math.setNumber(20,2);
        math.Display();

        System.out.println();
        MatematikaCanggih math2 = new MatematikaCanggih();
        System.out.println("Class MatematikaCanggih");
        math2.setNumber(20,6);
        math2.Display();
        


    }
}

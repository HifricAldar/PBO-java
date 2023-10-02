package matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        System.out.println("Class Matematika");
        math.setNumber(20,20);
        System.out.println("pertambahan: "+math.getNumberA()+" + "+math.getNumberB()+" = "+ math.pertambahan());
        math.setNumber(10,5);
        System.out.println("pengurangan: "+math.getNumberA()+" - "+math.getNumberB()+" = "+ math.pengurangan());
        math.setNumber(10,20);
        System.out.println("perkalian: "+math.getNumberA()+" * "+math.getNumberB()+" = "+ math.perkalian());
        math.setNumber(21,2);
        System.out.println("pembagian: "+math.getNumberA()+" / "+math.getNumberB()+" = "+ math.pembagian());

        System.out.println();
        MatematikaCanggih math2 = new MatematikaCanggih();
        System.out.println("Class MtematikaCanggih");
        math2.setNumber(20,20);
        System.out.println("pertambahan: "+math2.getNumberA()+" + "+math2.getNumberB()+" = "+ math2.pertambahan());
        System.out.println("perkalian: "+math2.getNumberA()+" * "+math2.getNumberB()+" = "+ math2.perkalian());
        math2.setNumber(20,6);
        System.out.println("Modulus: "+math2.getNumberA()+" % "+math2.getNumberB()+" = "+ math2.modulus());
        


    }
}

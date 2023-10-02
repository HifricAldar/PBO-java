package bentuk;

public class BentukMain {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(12);
        bs.setColor("blue");
        bs.Display();

        System.out.println();
        Lingkaran round = new Lingkaran(27);
        round.setColor("green");
        round.Display();

        System.out.println();
        Silinder sl = new Silinder(20);
        sl.setColor("Yellow");
        sl.setRadius(5);
        sl.Display();
    }
}

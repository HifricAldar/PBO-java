package bentuk;

public class BentukMain {
    public static void main(String[] args) {
        System.out.println();
        BujurSangkar bs = new BujurSangkar(12);
        bs.setColor("blue");
        bs.Display();

        Lingkaran round = new Lingkaran(27);
        round.setColor("green");
        round.Display();

        Silinder sl = new Silinder(20);
        sl.setColor("Yellow");
        sl.setRadius(5);
        sl.Display();
    }
}

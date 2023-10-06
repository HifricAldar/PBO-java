package bentuk;

public class BentukMain {
    public static void main(String[] args) {
        System.out.println();
        BujurSangkar bs = new BujurSangkar("Blue",12);
        bs.Display();

        Lingkaran round = new Lingkaran("Green", 27);
        round.Display();

        Silinder sl = new Silinder("Yellow", 5, 20);
        sl.Display();
    }
}

package lab5.Task1;

public class Main {
    public static void main(String[] args) {
        Playable piano = new Piano("Piano");
        Playable guitar = new Guitar("Guitar");
        Playable drums = new Drums("Drums");

        display(piano);
        display(guitar);
        display(drums);
    }
    private static void display(Playable pl) {
        pl.play();
    }
}

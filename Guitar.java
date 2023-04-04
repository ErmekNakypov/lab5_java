package lab5.Task1;

public class Guitar implements Playable {

    private String instrument;

    public Guitar() {
    }

    public Guitar(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.print("Sagynbekov Arsen ");
        System.out.printf("is playing %s...%n", getInstrument());
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}

package lab5.Task1;

public class Piano implements Playable {

    private String instrument;

    public Piano() {

    }

    public Piano(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.print("Asanbek u Rysbek ");
        System.out.printf("is playing %s...%n", getInstrument());
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}

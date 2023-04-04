package lab5.Task1;

public class Drums implements Playable {

    private String instrument;

    public Drums() {
    }

    public Drums(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.print("The Dog ");
        System.out.printf("is playing %s...%n", getInstrument());
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}

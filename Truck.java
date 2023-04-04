package lab5.Task2;

public class Truck extends Vehicle implements SpeedSetter {
    public Truck() {
    }

    public Truck(Integer maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void setSpeed() {
        super.setMaxSpeed(80);
    }
}

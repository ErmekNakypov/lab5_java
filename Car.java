package lab5.Task2;

public class Car extends Vehicle implements SpeedSetter {
    public Car() {
    }

    public Car(Integer maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void setSpeed() {
        super.setMaxSpeed(100);
    }
}

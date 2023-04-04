package lab5.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed();

        Truck truck = new Truck();
        truck.setSpeed();

        System.out.println("Car max speed: " + car.getMaxSpeed());
        System.out.println("Truck max speed: " + truck.getMaxSpeed());
    }
}

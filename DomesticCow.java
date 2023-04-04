package lab5.Task3;

import java.time.LocalTime;

public class DomesticCow implements Domestic {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public boolean isFriendly() {
        return LocalTime.now().isBefore(LocalTime.MIDNIGHT);
    }
}

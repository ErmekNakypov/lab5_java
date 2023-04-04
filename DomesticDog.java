package lab5.Task3;

import java.time.Year;

public class DomesticDog implements Domestic {
    @Override
    public void makeSound() {
        System.out.println("Bow-wow");
    }

    @Override
    public boolean isFriendly() {
        return Year.now().isLeap();
    }
}

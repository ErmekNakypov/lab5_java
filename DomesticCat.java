package lab5.Task3;

import java.util.Random;

public class DomesticCat implements Domestic {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean isFriendly() {
        return new Random().nextInt() % 2 == 0;
    }
}

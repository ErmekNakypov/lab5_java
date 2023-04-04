package lab5.Task3;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cow = new Cow();
        cow.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
        System.out.println();

        DomesticDog domesticDog = new DomesticDog();
        domesticDog.makeSound();
        System.out.printf("The dog is %s%n", domesticDog.isFriendly() ? "friendly" : "not friendly");
        DomesticCat  domesticCat = new DomesticCat();
        domesticCat.makeSound();
        System.out.printf("The cat is %s%n", domesticCat.isFriendly() ? "friendly" : "not friendly");
        DomesticCow domesticCow = new DomesticCow();
        domesticCow.makeSound();
        System.out.printf("The cow is %s", domesticCow.isFriendly() ? "friendly" : "not friendly");
    }
}

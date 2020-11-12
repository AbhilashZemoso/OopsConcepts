package DesignPatterns.AbstractFactoryPattern;

public class WildAnimalFactory implements AnimalAbstractFactory {
    public Dog createDog() {
        return new WildDog();
    }

    public Tiger createTiger() {
        return new WildTiger();
    }
}

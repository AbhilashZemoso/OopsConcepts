package DesignPatterns.AbstractFactoryPattern;

public class PetAnimalFactory implements AnimalAbstractFactory {
    public Dog createDog() {
        return new PetDog();
    }

    public Tiger createTiger() {
        return new PetTiger();
    }
}

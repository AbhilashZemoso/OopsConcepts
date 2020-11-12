package DesignPatterns.AbstractFactoryPattern;


public class AbstractFactoryDemo {
    public static void main(String args[]) {
        AnimalAbstractFactory wildFac = new WildAnimalFactory();
        AnimalAbstractFactory petFac = new PetAnimalFactory();
        Dog petDog = petFac.createDog();
        Tiger wildTiger = wildFac.createTiger();
        petDog.speak();
        petDog.preferredAction();
        wildTiger.speak();
        wildTiger.preferredAction();
    }
}

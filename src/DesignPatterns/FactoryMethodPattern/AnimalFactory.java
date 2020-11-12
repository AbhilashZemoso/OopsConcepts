package DesignPatterns.FactoryMethodPattern;

abstract class AnimalFactory{
    abstract Animal createAnimal();
    Animal makeAnimal(){
        //lets the sub class decide which object to instantiate
        Animal animal = createAnimal();
        //take advantage of abstract factory method
        animal.sounds();
        animal.wantsTo();
        return animal;
    }
}

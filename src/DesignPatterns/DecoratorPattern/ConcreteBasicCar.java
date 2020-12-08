package DesignPatterns.DecoratorPattern;

class ConcreteBasicCar extends BasicCar {
    void makeCar() {
        addPart("simple basic car");
    }
}

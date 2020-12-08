package DesignPatterns.DecoratorPattern;

abstract class BasicCar {

    abstract void makeCar();

    void addPart(String part) {
        System.out.println("added part: " + part);
    }
}

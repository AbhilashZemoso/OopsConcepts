package DesignPatterns.DecoratorPattern;

abstract class AbstractDecorator extends BasicCar {
    private BasicCar car;

    void setCar(BasicCar theCar) {
        car = theCar;
    }

    void makeCar() {
        if (car != null)
            car.makeCar();
    }
}

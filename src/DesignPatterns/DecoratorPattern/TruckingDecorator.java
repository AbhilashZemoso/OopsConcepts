package DesignPatterns.DecoratorPattern;

class TruckingDecorator extends AbstractDecorator {
    void makeCar() {
        super.makeCar();
        //additional feature

        addLargeWheels();
    }

    private void addLargeWheels() {
        addPart("Big Round Wheels added");
    }
}

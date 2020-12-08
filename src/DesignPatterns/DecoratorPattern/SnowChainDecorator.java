package DesignPatterns.DecoratorPattern;

class SnowChainDecorator extends AbstractDecorator {
    void makeCar() {
        super.makeCar();

        addChainsToWheels();
    }

    private void addChainsToWheels() {
        addPart("Snow chains added to wheels");
    }
}

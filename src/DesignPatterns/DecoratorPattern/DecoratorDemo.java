package DesignPatterns.DecoratorPattern;

import java.util.LinkedList;
import java.util.List;


public class DecoratorDemo {
    public static void main(String args[]){
        System.out.println("--------Decorator Demo-----------\n");
        BasicCar noDecorator = new ConcreteBasicCar();
        noDecorator.makeCar();

        System.out.println("\n--------Trucking Decorator-------\n");
        TruckingDecorator truckingCar = new TruckingDecorator();
        truckingCar.setCar(noDecorator);
        truckingCar.makeCar();

        System.out.println("\n---------Snow Chain Decorator-----\n");
        SnowChainDecorator snowChainCar = new SnowChainDecorator();
        snowChainCar.setCar(truckingCar);
        snowChainCar.makeCar();
    }
}

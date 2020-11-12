package DesignPatterns.FactoryMethodPattern;

public class FactoryMethodDemo {
    public static void main(String args[]){
        AnimalFactory lionFactory = new LionFactory();
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.makeAnimal();
        System.out.println("----------------");
        Animal lion = lionFactory.makeAnimal();
    }
}

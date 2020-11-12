package DesignPatterns.FactoryMethodPattern;

class LionFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Lion();
    }
}

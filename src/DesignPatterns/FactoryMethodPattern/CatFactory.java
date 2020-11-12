package DesignPatterns.FactoryMethodPattern;

class CatFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Cat();
    }
}

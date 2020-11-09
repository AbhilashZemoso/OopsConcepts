package DesignPatterns;

interface Animal{
    void sounds();
    void wantsTo();
}

class Lion implements Animal{
    public void sounds(){
        System.out.println("Roars");
    }

    public void wantsTo(){
        System.out.println("Hunt and Relax");
    }
}

class Cat implements Animal{
    public void sounds(){
        System.out.println("Mewww..");
    }

    public void wantsTo(){
        System.out.println("Sleep and Scratch");
    }
}

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

class LionFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Lion();
    }
}

class CatFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Cat();
    }
}

public class FactoryMethodDemo {
    public static void main(String args[]){
        AnimalFactory lionFactory = new LionFactory();
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.makeAnimal();
        System.out.println("----------------");
        Animal lion = lionFactory.makeAnimal();
    }
}

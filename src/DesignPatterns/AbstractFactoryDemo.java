package DesignPatterns;

interface Dog {
    void speak();

    void preferredAction();
}

interface Tiger {
    void speak();

    void preferredAction();
}

class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild Dog says loudly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Dogs prefer to roam freely in jungles.\n");
    }
}

class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet Dog says softly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dogs prefer to stay at home.\n");
    }
}


class WildTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Wild Tiger says loudly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tigers prefer hunting in jungles.\n");
    }
}

class PetTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tigers play in the animal circus.\n");
    }
}

interface AnimalAbstractFactory{
    Dog createDog();

    Tiger createTiger();
}

class WildAnimalFactory implements AnimalAbstractFactory{
    public Dog createDog(){
        return new WildDog();
    }

    public Tiger createTiger(){
        return new WildTiger();
    }
}

class PetAnimalFactory implements AnimalAbstractFactory{
    public Dog createDog(){
        return new PetDog();
    }

    public Tiger createTiger(){
        return new PetTiger();
    }
}

public class AbstractFactoryDemo {
    public static void main(String args[]){
        AnimalAbstractFactory wildFac = new WildAnimalFactory();
        AnimalAbstractFactory petFac = new PetAnimalFactory();
        Dog petDog = petFac.createDog();
        Tiger wildTiger = wildFac.createTiger();
        petDog.speak();
        petDog.preferredAction();
        wildTiger.speak();
        wildTiger.preferredAction();
    }
}

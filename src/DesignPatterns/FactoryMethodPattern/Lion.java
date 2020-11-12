package DesignPatterns.FactoryMethodPattern;

class Lion implements Animal{
    public void sounds(){
        System.out.println("Roars");
    }

    public void wantsTo(){
        System.out.println("Hunt and Relax");
    }
}

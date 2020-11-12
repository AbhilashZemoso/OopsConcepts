package DesignPatterns.FactoryMethodPattern;

class Cat implements Animal{
    public void sounds(){
        System.out.println("Mewww..");
    }

    public void wantsTo(){
        System.out.println("Sleep and Scratch");
    }
}

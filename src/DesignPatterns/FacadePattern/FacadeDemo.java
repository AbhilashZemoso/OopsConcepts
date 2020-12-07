package DesignPatterns.FacadePattern;


public class FacadeDemo {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***\n");
        //Creating Toys
        ToyFacade milanoToyFacade = new ToyFacade();
        milanoToyFacade.constructMilanoToy();
        ToyFacade robonautToyFacade = new ToyFacade();
        robonautToyFacade.constructRobonautToy();
        //Destroying Toys
        milanoToyFacade.destroyMilanoToy();
        robonautToyFacade.destroyRobonautToy();
    }
}
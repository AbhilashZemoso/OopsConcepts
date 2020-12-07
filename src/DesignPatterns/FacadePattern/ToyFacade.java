package DesignPatterns.FacadePattern;

public
class ToyFacade {
    ToyColor rColor;
    ToyHands rHands;
    ToyBody rBody;

    public ToyFacade() {
        rColor = new ToyColor();
        rHands = new ToyHands();
        rBody = new ToyBody();
    }

    //Constructing a Milano Toy
    public void constructMilanoToy() {
        ToyBody.createToy();
        System.out.println("Creation of a Milano Toy Start.");
        rColor.setDefaultColor();
        rHands.setMilanoHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println(" Milano Toy Creation End.\n");
    }

    //Constructing a Robonaut Toy
    public void constructRobonautToy() {
        ToyBody.createToy();
        System.out.println("Initiating the creational process of a Robonaut Toy.");
        rColor.setGreenColor();
        rHands.setRobonautHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println("A Robonaut Toy is created.\n");
    }

    //Destroying a Milano Toy
    public void destroyMilanoToy() {
        ToyBody.destroyToy();
        System.out.println(" Milano Toy's destruction process is started.");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" Milano Toy's destruction process is over.\n");
    }

    //Destroying a Robonaut Toy
    public void destroyRobonautToy() {
        ToyBody.destroyToy();
        System.out.println(" Initiating a Robonaut Toy's destruction process.");
        rHands.resetRobonautHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" A Robonaut Toy is destroyed.");
        System.out.println();
    }
}


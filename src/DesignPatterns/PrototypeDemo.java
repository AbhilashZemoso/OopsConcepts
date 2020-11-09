package DesignPatterns;

abstract class BasicCake implements Cloneable {
    private String flavour, printedDetails, addOns = "";

    void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    String getFlavour() {
        return this.flavour;
    }

    void setDetails(String printedDetails) {
        this.printedDetails = printedDetails;
    }

    String getDetails() {
        return this.printedDetails;
    }

    String getAddOns() {
        return this.addOns;
    }

    void addAddOns(String addOn) {
        this.addOns += addOn + ", ";
    }

    void DisplayCake() {
        System.out.println("Flavour : " + getFlavour());
        System.out.println("Details : " + getDetails());
        System.out.println("Add Ons : " + getAddOns() + "\n-----------------\n");
    }

    public BasicCake clone() throws CloneNotSupportedException {
        return (BasicCake) super.clone();
    }

}

class BDayCake extends BasicCake {
    BDayCake(String name) {
        setDetails(name);
        addAddOns("Sparkling Candles");
    }


    public BDayCake clone() throws CloneNotSupportedException {
        return (BDayCake) super.clone();
    }
}

class WeddingCake extends BasicCake {
    WeddingCake() {
    }

    WeddingCake(String name) {
        setDetails(name);
        addAddOns("Couple Candles");
    }

    public WeddingCake clone() throws CloneNotSupportedException {
        return (WeddingCake) super.clone();
    }
}

class LargeWeddingCake extends WeddingCake {
    LargeWeddingCake(String name) {
        super(name);
    }
}

public class PrototypeDemo {
    public static void main(String args[]) throws CloneNotSupportedException {
        BDayCake bcake1 = new BDayCake("Happy BDay Sam");
        bcake1.setFlavour("Vanilla");
        //try changing to BasicCake
        WeddingCake wcake1 = new WeddingCake("Happy Wedding Day Ram and Sita");
        wcake1.setFlavour("Strawberry");
        BDayCake bcake2 = bcake1.clone();
        bcake2.setDetails("Happy BDay Abhi");
        BasicCake wcake2 = wcake1.clone();
        wcake2.setDetails("Happy Wedding Day Romeo and Juliate");
        bcake1.DisplayCake();
        bcake2.DisplayCake();
        wcake1.DisplayCake();
        wcake2.DisplayCake();

        WeddingCake lcake = wcake1.clone();

        BasicCake defaultCake = new BDayCake("HBD Sai");

    }
}

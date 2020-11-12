package DesignPatterns.PrototypePattern;

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

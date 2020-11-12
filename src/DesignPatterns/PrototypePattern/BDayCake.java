package DesignPatterns.PrototypePattern;

class BDayCake extends BasicCake {
    BDayCake(String name) {
        setDetails(name);
        addAddOns("Sparkling Candles");
    }


    public BDayCake clone() throws CloneNotSupportedException {
        return (BDayCake) super.clone();
    }
}

package DesignPatterns.PrototypePattern;

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

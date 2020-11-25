package DesignPatterns.PrototypePattern;

class WeddingCake extends BasicCake {

    WeddingCake(String name) {
        System.out.println("=======>>Wed cake cons");
        setDetails(name);
        addAddOns("Couple Candles");
    }

    public WeddingCake clone() throws CloneNotSupportedException {
        return (WeddingCake) super.clone();
    }
}

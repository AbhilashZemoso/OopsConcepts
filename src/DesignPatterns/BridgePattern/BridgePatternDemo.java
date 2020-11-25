package DesignPatterns.BridgePattern;


public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("***Television***");
        State presentState = new OnState();
        ElectronicGoods tv = new Television();
        tv.setState(presentState);
        tv.moveToCurrentState();
        tv.hardButtonPressed();

        presentState = new OffState();
        tv.setState(presentState);
        tv.moveToCurrentState();

        System.out.println("\n***DVD***");
        presentState = new OnState();
        ElectronicGoods dvd = new DVD();
        dvd.setState(presentState);
        dvd.moveToCurrentState();
        presentState = new OffState();

        dvd = new DVD();
        dvd.setState(presentState);
        dvd.moveToCurrentState();
        ((DVD)dvd).doublePress();
    }
}

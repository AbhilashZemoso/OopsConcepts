package DesignPatterns.BridgePattern;

//Another Concrete Implementor.
class OffState implements State {
    @Override
    public void moveState() {
        System.out.print("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.print("The device is Offline now\n");
    }
}

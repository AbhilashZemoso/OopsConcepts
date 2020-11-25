package DesignPatterns.BridgePattern;

//Concrete Implementor.
class OnState implements State
{
    @Override
    public void moveState()
    {
        System.out.print("On State\n");
    }
    @Override
    public void hardPressed()
    {
        System.out.print("The device is already On\n");
    }
}

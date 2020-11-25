package DesignPatterns.BridgePattern;

//Refined Abstraction
class DVD extends ElectronicGoods
{
    public void doublePress() {
        hardButtonPressed();
        hardButtonPressed();
    }
}

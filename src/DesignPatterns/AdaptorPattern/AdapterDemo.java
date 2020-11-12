package DesignPatterns.AdaptorPattern;


public class AdapterDemo {
    public static void main(String args[]) {
        Igui gui1 = new GUI();
        gui1.getData();
        gui1.displayDataInGUI();
        System.out.println("------------");
        IAugmentedReality ag1 = new AugmentedReality();
        ag1.captureGestures();
        ag1.displayDataInAR();
        System.out.println("------------");
        System.out.println("Implementing AugmentedReality through Adaptor");
        Igui adaptor = new AugmentedRealityAdaptor(ag1);
        adaptor.getData();
        adaptor.displayDataInGUI();
    }
}

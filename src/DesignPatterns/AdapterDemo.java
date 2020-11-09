package DesignPatterns;

interface Igui{
    void getData();
    void displayDataInGUI();
}

class GUI implements Igui{
    public void getData(){
        System.out.println("Fetching data through command line");
    }

    public void displayDataInGUI(){
        System.out.println("Data is displayed on command line");
    }
}

interface IAugmentedReality{
    void captureGestures();
    void displayDataInAR();
}

class AugmentedReality implements IAugmentedReality{
    public void captureGestures(){
        System.out.println("Fetching gestures through sensors");
    }

    public void displayDataInAR(){
        System.out.println("Data is displayed in reality");
    }
}

class AugmentedRealityAdaptor implements Igui{
    IAugmentedReality ag;
    AugmentedRealityAdaptor(IAugmentedReality ag){
        this.ag = ag;
    }
    public void getData(){
        ag.captureGestures();
    }

    public void displayDataInGUI(){
        ag.displayDataInAR();
    }
}


public class AdapterDemo {
    public static void main(String args[]){
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

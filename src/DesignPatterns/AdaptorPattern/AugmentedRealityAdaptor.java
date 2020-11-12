package DesignPatterns.AdaptorPattern;

class AugmentedRealityAdaptor implements Igui {
    IAugmentedReality ag;

    AugmentedRealityAdaptor(IAugmentedReality ag) {
        this.ag = ag;
    }

    public void getData() {
        ag.captureGestures();
    }

    public void displayDataInGUI() {
        ag.displayDataInAR();
    }
}

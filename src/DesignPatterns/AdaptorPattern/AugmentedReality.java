package DesignPatterns.AdaptorPattern;

class AugmentedReality implements IAugmentedReality {
    public void captureGestures() {
        System.out.println("Fetching gestures through sensors");
    }

    public void displayDataInAR() {
        System.out.println("Data is displayed in reality");
    }
}

package DesignPatterns.AdaptorPattern;

class GUI implements Igui {
    public void getData() {
        System.out.println("Fetching data through command line");
    }

    public void displayDataInGUI() {
        System.out.println("Data is displayed on command line");
    }
}

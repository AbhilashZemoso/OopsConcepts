package OOPSExamples.TV;

//Black and white TV gets upgraded to Color TV
class ColorTV extends BlackAndWhite {
    private final int resolution;

    ColorTV(int resolution) {
        this.resolution = resolution;
    }

    public void printResolution() {
        System.out.println("Resolutionis is : " + this.resolution);
    }

    public void operate(){
        super.operate();
        System.out.println("Remote can be used to operate");
    }

    public void howItWorks() {
        System.out.println("\n Working Process :\nThere are three electron beams that move" +
                " simultaneously across the screen. They are named the red, green and blue beams.");
    }

    public void displayDetails(){
        System.out.println("\n\nColor TV ");
        this.printResolution();
        this.operate();
    }
}

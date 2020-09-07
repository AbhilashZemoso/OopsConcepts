import java.awt.image.SampleModel;

interface TV {
    void displayDetails();
    void operate();
    void howItWorks();
}


class BlackAndWhite implements TV {
    public void howItWorks() {
        System.out.println("\n Working Process :\nIn a black-and-white TV, the screen is coated with white phosphor " +
                "and the electron beam \"paints\" an image onto the screen by moving the electron" +
                " beam across the phosphor a line at a time.");
    }

    public void displayDetails(){
        System.out.println("\n\nBlack and White TV");
        this.operate();
    }

    public void operate(){
        System.out.println("TV contains switches to operate");
    }
}

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

//Color TV gets upgraded to Modern TV
class ModernTV extends ColorTV{
    ModernTV(int resolution){
        super(resolution);
    }

    public void howItWorks() {
        System.out.println("\n Working Process :\nPlasma TV is a television display technology in which each pixel" +
                " on the screen is illuminated by a tiny bit of plasma (charged gas). The plasma is" +
                " encased between two thin sheets of glass.");
    }

    public void displayDetails(){
        System.out.println("\n\nModern TV");
        this.printResolution();
        this.operate();
        this.usbInput();
    }

    public void usbInput(){
        System.out.println("USB slot is available");
    }
}

class TVDemo {
    public static void main(String args[]){
        TV samsung = new ColorTV(720);
        samsung.displayDetails();
        samsung.howItWorks();

        TV philips = new ModernTV(1080);
        philips.displayDetails();
        philips.howItWorks();
    }
}

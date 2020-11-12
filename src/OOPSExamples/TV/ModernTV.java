package OOPSExamples.TV;

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

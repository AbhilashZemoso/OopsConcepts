package OOPSExamples.TV;

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

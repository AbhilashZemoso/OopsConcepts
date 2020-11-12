package OOPSExamples.TV;


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

package OOPSExamples.Mobile;

import java.lang.*;


class MobileDemo {
    public static void main(String args[]) {
        GlobalMobile mob1 = new Oppo("f17", "Android Oreo", "Snap Dragon 750");
        GlobalMobile mob2 = new Vivo("Y51L", "Android Lollipop", "Snap Dragon 650");
        ((Oppo) mob1).setLock("PIN", "1234");
        ((Oppo) mob1).displayDetails();
        ((Oppo) mob1).displayDetails("1234");
        ((Vivo) mob2).displayDetails();
        mob1.call("9999999999");
        mob2.call("8888888888");
    }
}


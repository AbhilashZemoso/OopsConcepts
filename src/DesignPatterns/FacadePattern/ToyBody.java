package DesignPatterns.FacadePattern;

public class ToyBody {
    public static void createToy() {
        System.out.println(" Refer the manual before creation of a Toy.");
    }

    public void createHands() {
        System.out.println(" Hands manufactured.");
    }

    public void createRemainingParts() {
        System.out.println(" Remaining parts (other than hands) are created.");
    }

    public static void destroyToy() {
        System.out.println(" Refer the manual before destroying of a Toy.");
    }

    public void destroyHands() {
        System.out.println(" The Toy's hands are destroyed.");
    }

    public void destroyRemainingParts() {
        System.out.println(" The Toy's remaining parts are destroyed.");
    }
}

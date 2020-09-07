import java.io.*;
import java.util.*;
import java.lang.*;


interface GlobalMobile {
    // Complete Abstraction through interfaces
    void call(String number);
}

abstract class SmartPhones implements GlobalMobile {
    //Abstraction
    public String lockType, model;
    private String lockValue, os, processor;

    SmartPhones() {
        this.lockType = "";
        this.lockValue = "";
    }

    //Encapsulation
    String getOS() {
        return this.os;
    }

    String getProcessor() {
        return this.processor;
    }

    void setProcessor(String processor) {
        this.processor = processor;
    }


    void setOS(String os) {
        this.os = os;
    }

    void setLock(String type, String value) {
        this.lockType = type;
        this.lockValue = value;
    }

    boolean unlock(String value) {
        if (this.lockValue.equals(value)) {
            System.out.println("Unlocked");
            return true;
        } else {
            System.out.println("Incorrect " + this.lockType);
            return false;
        }
    }

    protected void displayDetails(String company, String model) {
        System.out.println(company + model + " specifications");
        System.out.println(" OS : " + getOS());
        System.out.println(" Processor : " + getProcessor());
    }

}

class Vivo extends SmartPhones {
    // Inheritance

    Vivo(String model, String os, String processor) {
        this.model = model;
        setOS(os);
        setProcessor(processor);
    }

    //Overriding
    public void call(String number) {
        System.out.println("Vivo calling..." + number + "\n\n");
    }

    //method Overloading
    public void displayDetails() {
        if ("".equals(lockType)) {
            displayDetails("Vivo", this.model);
            cloud();
        } else {
            System.out.println("Enter " + this.lockType);
        }
        System.out.println("---------------------\n");
    }

    //method Overloading
    public void displayDetails(String value) {
        if (unlock(value)) {
            displayDetails("Vivo", this.model);
            cloud();
        }
        System.out.println("---------------------\n");
    }

    private void cloud() {
        System.out.println("Vivo provides 20GB cloud storage\n\n");
    }

}

class Oppo extends SmartPhones {

    Oppo(String model, String os, String processor) {
        this.model = model;
        setOS(os);
        setProcessor(processor);
    }

    public void call(String number) {
        System.out.println("Oppo calling..." + number + "\n\n");
    }

    public void displayDetails() {
        if ("".equals(lockType)) {
            displayDetails("Oppo", this.model);
            security();
        } else {
            System.out.println("Please enter the " + this.lockType);
        }
        System.out.println("---------------------\n");
    }

    public void displayDetails(String value) {
        if (unlock(value)) {
            displayDetails("Oppo", this.model);
            security();
        }
        System.out.println("---------------------\n");
    }

    private void security() {
        System.out.println("Norton security is provided for 2 years\n\n");
    }
}


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


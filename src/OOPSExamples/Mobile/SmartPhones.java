package OOPSExamples.Mobile;

abstract class SmartPhones implements GlobalMobile {
    //Abstraction
    public String lockType, model;
    private String lockValue, os, processor;

    SmartPhones() {
        this.lockType = "";
        this.lockValue = "";
    }


    public void call(String number) {
        //no picture
        System.out.println(" Calling from Smart phone ....." + number);
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

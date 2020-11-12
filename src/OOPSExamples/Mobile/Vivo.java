package OOPSExamples.Mobile;

class Vivo extends SmartPhones {
    // Inheritance

    Vivo(String model, String os, String processor) {
        this.model = model;
        setOS(os);
        setProcessor(processor);
    }

    //Overriding
    public void call(String number) {
        //can add picture to interface
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

package OOPSExamples.Mobile;

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

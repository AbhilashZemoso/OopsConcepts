package Association;

class Employee {
    String name;
    Job job;
    Address address;

    Employee(String name, String role, String description, Address address) {
        this.name = name;
        //composition
        job = new Job(role, description);
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("\n\nName : " + name);
        job.display();
        address.display();
    }
}

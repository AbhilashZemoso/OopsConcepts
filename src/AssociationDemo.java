class Job {
    String role, description;

    Job(String role, String description) {
        this.role = role;
        this.description = description;
    }

    void display() {
        System.out.println("Works as a " + role + " : " + description);
    }
}

class Address {
    String doorNo, street, city;

    Address(String doorNo, String street, String city) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
    }

    void display() {
        System.out.println("Address is : " + doorNo + ", " + street + ", " + city);
    }
}

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

class AssociationDemo {
    public static void main(String args[]) {
        //aggregation
        Address address = new Address("1-1-20", "Gachibowli", "Hyderabad");
        Employee emp1 = new Employee("Sam", "SE", "Software Engineer", address);
        Employee emp2 = new Employee("Ram", "SD", "Software Develpoer", address);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
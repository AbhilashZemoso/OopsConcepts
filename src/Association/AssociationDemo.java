package Association;

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
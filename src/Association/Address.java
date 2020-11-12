package Association;

class Address {
    String doorNo, street, city;

    Address(String doorNo, String street, String city) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
    }

    void display() {
        System.out.println("Association.Address is : " + doorNo + ", " + street + ", " + city);
    }
}

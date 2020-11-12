package OOPSExamples.Kitchen;

class Furniture extends Item {
    private final String material;

    Furniture(String name, int quantity, String material) {
        super(name, quantity);
        this.material = material;
    }

    void display() {
        System.out.println(this.name + " made of " + this.material + " : " + this.quantity);
    }
}

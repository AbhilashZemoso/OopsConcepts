package OOPSExamples.Kitchen;

abstract class Item {
    public final String name;
    public int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void addQuantity(int count) {
        this.quantity += count;
    }

    void display() {
        System.out.println(this.name + " : " + this.quantity);
    }
}

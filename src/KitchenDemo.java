import java.util.*;

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

class Utensil extends Item {
    Utensil(String name, int quantity) {
        super(name, quantity);
    }
}

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

class Kitchen {

    //HAS - A relationship
    //because if kitchen gets destroyed than its items get destroyed
    List<Item> utensils = new ArrayList<>();
    List<Item> furnitures = new ArrayList<>();

    boolean checkItem(List<Item> items, String name) {
        System.out.println("\nchecks for " + name + " in items list\n");
        //if does not exists
        return false;
    }

    void addUtensil(String name, int quantity) {
        if (checkItem(utensils,name))
            System.out.println("Incremented utensil " + name);
        else {
            Item ut = new Utensil(name, quantity);
            utensils.add(ut);
            System.out.println("Added utensil " + name);
        }
    }

    void addFurniture(String name, int quantity, String material){
        if(checkItem(furnitures,name))
            System.out.println("\nIncremented furniture"+name);
        else{
            Item fun = new Furniture(name,quantity,material);
            furnitures.add(fun);
            System.out.println("\nAdded furniture" + name);
        }
    }

    private void displayItems(List<Item> items){
        for(Item fun:items){
            fun.display();
        }
    }

    void viewKitchen(){
        System.out.println("\nFurniture ");
        displayItems(furnitures);
        System.out.println("\nUtensils ");
        displayItems(utensils);

    }

}

class KitchenDemo {
    public static void main(String args[]){
        Kitchen kt = new Kitchen();
        kt.addUtensil("spoon",12);
        kt.addFurniture("Dining Table",1,"wood");
        kt.viewKitchen();
    }
}

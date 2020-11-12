package OOPSExamples.Kitchen;

import java.util.ArrayList;
import java.util.List;

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

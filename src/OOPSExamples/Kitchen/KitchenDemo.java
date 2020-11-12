package OOPSExamples.Kitchen;

import java.util.*;

class KitchenDemo {
    public static void main(String args[]){
        Kitchen kt = new Kitchen();
        kt.addUtensil("spoon",12);
        kt.addFurniture("Dining Table",1,"wood");
        kt.viewKitchen();
    }
}

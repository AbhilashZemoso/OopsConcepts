package DesignPatterns.BuilderPattern;

import java.util.LinkedList;


public class BuilderDemo {
    public static void main(String args[]){
        Director dr = new Director();
        Mobile mob1 = new Vivo("Vivo Y51L");
        Mobile mob2 = new Oppo("Oppo F1 Pro");
        dr.contruct(mob1);
        dr.contruct(mob2);
        Product prod1 = mob1.finalProduct();
        Product prod2 = mob2.finalProduct();
        prod1.showProduct();
        prod2.showProduct();
    }
}

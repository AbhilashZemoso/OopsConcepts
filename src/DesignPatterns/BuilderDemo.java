package DesignPatterns;

import java.util.LinkedList;

interface Mobile {
    void addCamera();

    void addProcessor();

    void addStorage();

    void addName();

    Product finalProduct();
}


class Vivo implements Mobile{
    String modelName;
    Product product;
    Vivo(String modelName){
        product = new Product();
        this.modelName = modelName;
    }

    public void addCamera(){
        product.add("Camera : 10MP");
    }

    public void addProcessor(){
        product.add("Processor : Snapdragon 700");
    }

    public void addStorage(){
        product.add("Storage : 32GB");
    }

    public void addName(){
        product.add("Brand name : "+this.modelName);
    }

    public Product finalProduct(){
        return product;
    }
}

class Oppo implements Mobile{
    String modelName;
    Product product;
    Oppo(String modelName){
        product = new Product();
        this.modelName = modelName;
    }

    public void addCamera(){
        product.add("Camera : 20MP");
    }

    public void addProcessor(){
        product.add("Processor : Snapdragon 600");
    }

    public void addStorage(){
        product.add("Storage : 64GB");
    }

    public void addName(){
        product.add("Brand name : "+this.modelName);
    }

    public Product finalProduct(){
        return product;
    }
}


class Product {
    LinkedList<String> parts;

    Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("\nProduct description:");
        for (String part : parts)
            System.out.println(part);
    }
}


class Director {
    Mobile mob;
    public void contruct(Mobile mob){
        this.mob = mob;
        mob.addName();
        mob.addCamera();
        mob.addProcessor();
        mob.addStorage();
    }
}


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

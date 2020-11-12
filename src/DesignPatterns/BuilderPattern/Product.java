package DesignPatterns.BuilderPattern;

import java.util.LinkedList;

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

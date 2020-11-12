package DesignPatterns.BuilderPattern;

interface Mobile {
    void addCamera();

    void addProcessor();

    void addStorage();

    void addName();

    Product finalProduct();
}

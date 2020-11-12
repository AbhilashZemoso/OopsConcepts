package DesignPatterns.BuilderPattern;

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

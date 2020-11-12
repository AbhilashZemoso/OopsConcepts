package DesignPatterns.BuilderPattern;

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

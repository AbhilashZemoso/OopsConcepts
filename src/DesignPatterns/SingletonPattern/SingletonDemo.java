package DesignPatterns.SingletonPattern;

class SingletonDemo {
    public static void main(String args[]){
        HTML tab1 = new HTML();
        tab1.get();
        tab1.post();
        HTML tab2 = new HTML();
        tab2.get();
        tab2.get();
        tab2.post();
    }
}

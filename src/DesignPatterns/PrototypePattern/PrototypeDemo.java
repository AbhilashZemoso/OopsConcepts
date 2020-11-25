package DesignPatterns.PrototypePattern;

public class PrototypeDemo {
    public static void main(String args[]) throws CloneNotSupportedException {
        BDayCake bcake1 = new BDayCake("Happy BDay Sam");
        bcake1.setFlavour("Vanilla");
        //try changing to BasicCake

        WeddingCake wcake1 = new WeddingCake("Happy Wedding Day Ram and Sita");
        wcake1.setFlavour("Strawberry");

        BDayCake bcake2 = bcake1.clone();
        bcake2.setDetails("Happy BDay Abhi");

        BasicCake wcake2 = wcake1.clone();
        wcake2.setDetails("Happy Wedding Day Romeo and Juliate");

        bcake1.DisplayCake();
        bcake2.DisplayCake();
        wcake1.DisplayCake();
        wcake2.DisplayCake();
    }
}

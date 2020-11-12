package CleanCode.Objects;

class Procedural{
    void drawBold(Figure fig){
        if(fig instanceof Circle){
            System.out.println("Bold Circle Drawn");
        }
        else if(fig instanceof Square){
            System.out.println("Bold Square Drawn");
        }
        else if(fig instanceof Rectangle){
            System.out.println("Bold Rectangle Drawn");
        }
    }

}

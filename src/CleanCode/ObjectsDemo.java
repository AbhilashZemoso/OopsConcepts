package CleanCode;

interface Figure{
    void draw();
}

class Circle implements Figure{
    public void draw(){
        System.out.println("Circle Drawn\n");
    }
}

class Square implements Figure{
    public void draw(){
        System.out.println("Square Drawn\n");
    }
}

//now we want to add new class its easy in objects

class Rectangle implements Figure{
    public void draw(){
        System.out.println("Rectangle Drawn\n");
    }
}

//now we want to add a new method called drawBold()

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


public class ObjectsDemo {
}

package CleanCode;


import java.util.concurrent.CancellationException;
import java.util.logging.FileHandler;

//less arguments
class Point {
    private double x, y, z;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double difference(Point p){
        return (this.x-p.x)+(this.y-p.y);
    }
}


//SRP
class WebPageRequest {
    //@get
    void drawImage(HyperPlane hyperPlaneObject) {
        hyperPlaneObject.makeHyperPlane(new Point(0, 0, 0), new Point(1, 1, 1));
    }
}

class HyperPlane {
    public void makeHyperPlane(Point p1, Point p2) {
        isValidPoint(p1);
        isValidPoint(p2);

        getSquareDistance(p1, p2);
    }

    //Step down principle
    private boolean isValidPoint(Point p) {
        //checks for edge cases
        return true;
    }

    private double getSquareDistance(Point p1, Point p2) {
        return Math.pow(getManHanttenDistance(p1, p2), 2);
    }

    private double getManHanttenDistance(Point p1, Point p2){
        return p1.difference(p2);
    }
}




public class FunctionsDemo {
}

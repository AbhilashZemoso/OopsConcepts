import java.io.File;
import java.util.LinkedList;
import java.util.List;

class Shape{
    List<Point> points;
    Shape(){
        points = new LinkedList<>();
    }

    void add(Point p){
        points.add(p);
    }

    List<Point> getPoints(){
        return points;
    }

    Point getLastPoint(){
        return points.get(points.size()-1);
    }
}

class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    double distance(Point other){
        return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
    }
}

class SolvingProblemDemo {
    public double getPerimeter(Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints(Shape s) {
        // Put code here
        //create integer to store count of points with initial value zero
        int countOfPoints = 0;
        //iterate each point and increment count by one for every iteration
        for (Point point : s.getPoints()) {
            countOfPoints++;
        }
        //return interger storing count of points
        return countOfPoints;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        //create an integer to store sum of lengths with initial value zero
        double sumOfLengths = 0, averageLength, distance;
        int numberOfPoints;
        //to store the previous point create a point with
        //initial point as lastPoint
        Point previousPoint = s.getLastPoint();
        //iterate over each point and add distance to sum of lengths
        for (Point point : s.getPoints()) {
            distance = point.distance(previousPoint);
            sumOfLengths += distance;
            //store current point in previous point
            previousPoint = point;
        }
        //get number of points
        numberOfPoints = getNumPoints(s);
        //now divide sum of lengths with number of points
        averageLength = sumOfLengths / numberOfPoints;
        //return the above evaluated value
        return averageLength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        //create a double which stores current maximum side length
        //with initial value 0
        double currentMaximumLength = 0, presentLength;
        //store the previous point and set initial value as lastPoint;
        Point previousPoint = s.getLastPoint();
        //iterate over each point and find length
        for (Point point : s.getPoints()) {
            //in loop get length
            presentLength = point.distance(previousPoint);
            //if this is greater than current maximum side length
            if (presentLength > currentMaximumLength) {
                //then replace current maximum with present length
                currentMaximumLength = presentLength;
            }
            //update previous point
            previousPoint = point;
        }
        //return current maximum side length
        return currentMaximumLength;
    }

    public static void main(String[] args) {
        Shape sh =new Shape();
        sh.add(new Point(0,0));
        sh.add(new Point(4,0));
        sh.add(new Point(3,3));
        sh.add(new Point(0,4));
        SolvingProblemDemo demo = new SolvingProblemDemo();
        System.out.println(demo.getPerimeter(sh));
        System.out.println(demo.getAverageLength(sh));
        System.out.println(demo.getLargestSide(sh));
    }
}

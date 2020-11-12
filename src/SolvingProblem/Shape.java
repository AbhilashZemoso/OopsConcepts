package SolvingProblem;

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

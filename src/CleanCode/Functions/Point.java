package CleanCode.Functions;

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

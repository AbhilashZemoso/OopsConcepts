package CleanCode.Functions;

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

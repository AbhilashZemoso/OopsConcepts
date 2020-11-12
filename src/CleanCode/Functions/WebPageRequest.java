package CleanCode.Functions;

//SRP
class WebPageRequest {
    //@get
    void drawImage(HyperPlane hyperPlaneObject) {
        hyperPlaneObject.makeHyperPlane(new Point(0, 0, 0), new Point(1, 1, 1));
    }
}

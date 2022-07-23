package Problem2;

abstract class Shape {
    ApplicationDriver.ShapeType shapeType;
    int[] sides;

    public Shape(ApplicationDriver.ShapeType Shapetype, int[] sides){
        this.shapeType=Shapetype;
        this.sides=sides;
    }
    abstract Float perimeter();
    abstract Float area();



}

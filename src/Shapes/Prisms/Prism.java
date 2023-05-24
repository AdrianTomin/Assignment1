package Shapes.Prisms;
import Shapes.Shape;

public abstract class Prism extends Shape {
    private double edgeLength;
    public Prism(double edgeLength, double height, String typeOfShape, String compareType) {
        super(height, typeOfShape, compareType);
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "Shapes.Prisms.Prism{" +
                "edgeLength=" + edgeLength +
                "} " + super.toString();
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public abstract double getArea();
    public abstract double getVolume();
}

package Shapes;

import Shapes.Shape;

public class Pyramid extends Shape {
    private double height;
    private double edgeLength;

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public Pyramid(double edgeLength, double height, String typeOfShape, String compareType) {
        super(height, typeOfShape, compareType);
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "height=" + height +
                ", edgeLength=" + edgeLength +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return Math.pow(edgeLength, 2);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.pow(edgeLength, 2) * this.getHeight();
    }
}

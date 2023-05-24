package Shapes;

import Shapes.Shape;

public class Cone extends Shape {
    private double height;
    private double radius;

    public Cone(double radius, double height, String typeOfShape, String compareType) {
        super(height, typeOfShape, compareType);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
    }
}

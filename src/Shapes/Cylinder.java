package Shapes;

import Shapes.Shape;

public class Cylinder extends Shape {
    private double height;
    private double radius;

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                "} " + super.toString();
    }

    public Cylinder(double radius, double height, String typeOfShape, String compareType) {
        super(height, typeOfShape, compareType);
        this.height = height;
        this.radius = radius;
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
        return Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
    }
}

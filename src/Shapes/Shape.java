package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    private double height;
    private final String compareType;
    private final String typeOfShape;

    public Shape(double height, String typeOfShape, String compareType) {
        this.height = height;
        this.typeOfShape = typeOfShape;
        this.compareType = compareType;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "volume='" + getVolume() +
                ", height=" + height +
                ", compareType='" + compareType + '\'' +
                ", typeOfShape='" + typeOfShape + '\'' +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getArea();

    public abstract double getVolume();

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(this.height, shape.height);

    }

    @Override
    public int compare(Shape s1, Shape s2) {
        switch (s1.compareType) {
            case "h" -> {
                return s1.compareTo(s2);
            }
            case "v" -> {
                return Double.compare(s1.getVolume(), s2.getVolume());
            }
            case "a" -> {
                return Double.compare(s1.getArea(), s2.getArea());
            }
        }
        return 0;
    }
}

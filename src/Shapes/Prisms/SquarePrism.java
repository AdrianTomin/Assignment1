package Shapes.Prisms;

public class SquarePrism extends Prism {
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

    @Override
    public double getEdgeLength() {
        return edgeLength;
    }

    @Override
    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "SquarePrism{" +
                "height=" + height +
                ", edgeLength=" + edgeLength +
                "} " + super.toString();
    }

    public SquarePrism(double edgeLength, double height, String typeOfShape, String compareType) {
        super(edgeLength, height, typeOfShape, compareType);
        this.height = height;
        this.edgeLength = edgeLength;
    }
    @Override
    public double getArea() {
        return Math.pow(this.getEdgeLength(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.edgeLength, 2) * this.getHeight();
    }
}

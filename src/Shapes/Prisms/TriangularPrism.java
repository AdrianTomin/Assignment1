package Shapes.Prisms;

public class TriangularPrism extends Prism {
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
        return "TriangularPrism{" +
                "height=" + height +
                ", edgeLength=" + edgeLength +
                "} " + super.toString();
    }

    public TriangularPrism(double edgeLength, double height, String typeOfShape, String compareType) {
        super(edgeLength, height, typeOfShape, compareType);
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea() {
        return (Math.pow(this.getEdgeLength(), 2) * Math.sqrt(3)) / 4.0;
    }

    @Override
    public double getVolume() {
        return this.getArea() * this.getHeight();
    }
}

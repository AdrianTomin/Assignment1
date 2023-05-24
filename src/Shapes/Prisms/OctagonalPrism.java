package Shapes.Prisms;

public class OctagonalPrism extends Prism {
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
        return "OctagonalPrism{" +
                "height=" + height +
                ", edgeLength=" + edgeLength +
                "} " + super.toString();
    }

    public OctagonalPrism(double height, double edgeLength, String compareType, String typeOfShape) {
        super(edgeLength, height, typeOfShape, compareType);
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2.0) * Math.pow(this.getEdgeLength(), 2));
    }

    @Override
    public double getVolume() {
        return this.getArea() * this.getHeight();
    }
}

import Shapes.*;
import Shapes.Prisms.OctagonalPrism;
import Shapes.Prisms.PentagonalPrism;
import Shapes.Prisms.SquarePrism;
import Shapes.Prisms.TriangularPrism;
import SortingAlgos.Sort;
import java.io.File;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String file = null;
            String compareType = null;
            String sortingType = null;
            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                switch (arg.toLowerCase()) {
                    case "-f" -> {
                        file = args[i + 1];
                        break;
                    }
                    case "-t" -> {
                        compareType = args[i + 1];
                        break;
                    }
                    case "-s" -> {
                        sortingType = args[i + 1];
                        break;
                    }
                }
            }
            File fileInput = null;
            if (file != null && compareType != null && sortingType != null) {

                fileInput = new File(file);
            }
            assert fileInput != null;
            Scanner sc = new Scanner(fileInput);
            int numOfShapes = sc.nextInt();

            Shape[] shapes = new Shape[numOfShapes];

            for (int i = 0; i < shapes.length; i++) {
                String typeOfShape = sc.next();
                double height = sc.nextDouble();
                double otherValue = sc.nextDouble();

                Shape shape = null;
                switch (typeOfShape) {
                    case "Cylinder" -> {
                        shape = new Cylinder(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "Cone" -> {
                        shape = new Cone(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "Pyramid" -> {
                        shape = new Pyramid(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "OctagonalPrism" -> {
                        shape = new OctagonalPrism(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "PentagonalPrism" -> {
                        shape = new PentagonalPrism(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "SquarePrism" -> {
                        shape = new SquarePrism(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    case "TriangularPrism" -> {
                        shape = new TriangularPrism(otherValue, height, typeOfShape, compareType);
                        break;
                    }
                    default -> {
                        System.out.println("Unrecognized shape type of: " + typeOfShape);
                        continue;
                    }
                }
                shapes[i] = shape;

            }
            double startTime = System.currentTimeMillis();
            sortShapes(shapes, sortingType);
            double endTime = System.currentTimeMillis();
            double totalTime = (endTime - startTime) / 1000;
            System.out.println("Shapes");
            System.out.println("Time: " + totalTime + " seconds");
            for (int i = 0; i < shapes.length; i++) {
                if (i == 0) {
                    System.out.println("1st value: " + shapes[0].toString());
                    System.out.println();
                } else if (i % 1000 == 0) {
                    System.out.println("1000th value: " + shapes[i].toString());
                    System.out.println();
                } else if (i == shapes.length - 1) {
                    System.out.println("Last value: " + shapes[shapes.length - 1].toString());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("There is an error " + e);
        }
    }
    private static void sortShapes(Shape[] shapes, String sortType) {
        switch (sortType.toLowerCase()) {
            case "b" -> {
                Sort.bubbleSort(shapes);
                break;
            }
            case "s" -> {
                Sort.selectionSort(shapes);
                break;
            }
            case "i" -> {
                Sort.insertionSort(shapes);
                break;
            }
            case "m" -> {
                Sort.mergeSort(shapes);
                break;
            }
            case "q" -> {
                Sort.quickSort(shapes);
                break;
            }
            case "z" -> {
                Sort.radixSort(shapes);
                break;
            }
            default -> throw new IllegalArgumentException("Invalid argument of " + sortType + ". Please choose b, s, i, m, q,  or z");
        }
    }
}

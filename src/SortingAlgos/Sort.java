package SortingAlgos;
import Shapes.Shape;

public class Sort {
    public static <T extends Shape> void bubbleSort(Shape[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (compareShapes(array[j], array[j + 1]) > 0) {
                    Shape temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Shape> void selectionSort(Shape[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (compareShapes(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Shape temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static <T extends Shape> void insertionSort(Shape[] array) {
        // Sorting logic here
    }

    public static <T extends Shape> void mergeSort(Shape[] array) {
        // Sorting logic here
    }

    public static <T extends Shape> void quickSort(Shape[] array) {
        // Sorting logic here
    }

    public static <T extends Shape> void radixSort(Shape[] array) {
        // Sorting logic here
    }

    private static <T extends Shape> int compareShapes(Shape s1, Shape s2) {
        return s1.compare(s1, s2);
    }
}


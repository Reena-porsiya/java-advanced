package javatopics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardExample {

    // Method to calculate the sum of a list of numbers
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Method to print elements of a list of numbers
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integerList: " + sumOfList(integerList));
        System.out.print("Elements in integerList: ");
        printList(integerList);

        // List of doubles
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Sum of doubleList: " + sumOfList(doubleList));
        System.out.print("Elements in doubleList: ");
        printList(doubleList);

        // List of floats
        List<Float> floatList = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f);
        System.out.println("Sum of floatList: " + sumOfList(floatList));
        System.out.print("Elements in floatList: ");
        printList(floatList);
    }
}

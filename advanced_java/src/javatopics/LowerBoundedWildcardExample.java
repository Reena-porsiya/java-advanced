package javatopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcardExample {

    // Method to add integers to a list
    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    // Method to print elements of a list
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List of integers
        List<Integer> integerList = new ArrayList<>();
        addIntegers(integerList);
        System.out.print("Elements in integerList: ");
        printList(integerList);

        // List of numbers
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList); // Lower bounded wildcard accepts Integer and its superclasses
        System.out.print("Elements in numberList: ");
        printList(numberList);

        // List of objects
        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList); // Lower bounded wildcard accepts Integer and its superclasses
        System.out.print("Elements in objectList: ");
        printList(objectList);
    }
}

package javatopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample {

    // Method that works with an unbounded wildcard
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Method that works with an upper-bounded wildcard
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Method that works with a lower-bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // Unbounded wildcard example
        List<String> strings = Arrays.asList("Hello", "World", "!");
        printList(strings);

        // Upper-bounded wildcard example
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumOfList(integers));

        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sumOfList(doubles));

        // Lower-bounded wildcard example
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        printList(numbers);

        List<Object> objects = new ArrayList<>();
        addNumbers(objects);
        printList(objects);
    }
}

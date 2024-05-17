package advanced_java;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamTerminalOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 9, 2, 8, 6, 5);

        // forEach: Performs an action for each element
        System.out.print("forEach: ");
        list.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();

        // collect: Collects elements into a collection using a collector
        List<Integer> collectedList = list.stream().collect(Collectors.toList());
        System.out.println("collect: " + collectedList);

        // toArray: Collects elements into an array
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println("toArray: " + Arrays.toString(array));

        // reduce: Reduces the elements to a single value using an associative accumulation function
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("reduce: " + sum);

        // min: Finds the minimum element based on a comparator
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(minVal -> System.out.println("min: " + minVal));

        // max: Finds the maximum element based on a comparator
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(maxVal -> System.out.println("max: " + maxVal));

        // count: Counts the number of elements in the stream
        long count = list.stream().count();
        System.out.println("count: " + count);

        // anyMatch: Checks if any element matches a predicate
        boolean anyMatch = list.stream().anyMatch(num -> num > 7);
        System.out.println("anyMatch: " + anyMatch);

        // allMatch: Checks if all elements match a predicate
        boolean allMatch = list.stream().allMatch(num -> num > 0);
        System.out.println("allMatch: " + allMatch);

        // noneMatch: Checks if no elements match a predicate
        boolean noneMatch = list.stream().noneMatch(num -> num < 0);
        System.out.println("noneMatch: " + noneMatch);

        // findFirst: Finds the first element in the stream
        Optional<Integer> first = list.stream().findFirst();
        first.ifPresent(firstVal -> System.out.println("findFirst: " + firstVal));

        // findAny: Finds any element in the stream
        Optional<Integer> any = list.stream().findAny();
        any.ifPresent(anyVal -> System.out.println("findAny: " + anyVal));
    }
}

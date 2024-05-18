package advancedjava;

import java.util.*;
import java.util.stream.*;

public class ShortCircuitingOperations {

    public static void main(String[] args) {
        // Example for anyMatch: Checks if any element matches a given predicate.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        boolean hasEven = numbers1.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch (hasEven): " + hasEven); // Output: true

        // Example for allMatch: Checks if all elements match a given predicate.
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers2.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allMatch (allEven): " + allEven); // Output: true

        // Example for noneMatch: Checks if no elements match a given predicate.
        List<Integer> numbers3 = Arrays.asList(1, 3, 5, 7, 9);
        boolean noneEven = numbers3.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("noneMatch (noneEven): " + noneEven); // Output: true

        // Example for findFirst: Returns the first element of the stream, if present.
        List<String> names1 = Arrays.asList("John", "Alice", "Bob");
        Optional<String> first = names1.stream().findFirst();
        first.ifPresent(name -> System.out.println("findFirst: " + name)); // Output: John

        // Example for findAny: Returns any element of the stream, if present.
        List<String> names2 = Arrays.asList("John", "Alice", "Bob");
        Optional<String> any = names2.stream().findAny();
        any.ifPresent(name -> System.out.println("findAny: " + name)); // Output: John or Alice or Bob
    }
}

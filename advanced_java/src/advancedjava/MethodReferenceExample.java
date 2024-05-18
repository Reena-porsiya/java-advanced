package advancedjava;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // 1. Reference to a static method
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println("Original list:");
        names.forEach(System.out::println);

        // Sort names using a method reference to a static method
        names.sort(MethodReferenceExample::compareByLength);
        System.out.println("\nSorted by length using static method reference:");
        names.forEach(System.out::println);

        // 2. Reference to an instance method of a particular object
        String prefix = "Hello, ";
        names.forEach(prefix::concat);

        System.out.println("\nPrefixed names using instance method reference:");
        names.forEach(name -> System.out.println(prefix + name));

        // 3. Reference to an instance method of an arbitrary object of a particular type
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("\nNames converted to uppercase using instance method reference:");
        upperCaseNames.forEach(System.out::println);

        // 4. Reference to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> newList = listSupplier.get();
        newList.addAll(names);
        System.out.println("\nNew list created using constructor reference:");
        newList.forEach(System.out::println);
    }

    // Static method for comparing strings by length
    public static int compareByLength(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}


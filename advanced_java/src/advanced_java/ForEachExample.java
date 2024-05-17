package advanced_java;

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        // Example 1: Using forEach with a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Printing each element of the list using forEach
        System.out.println("Example 1:");
        names.forEach(name -> System.out.println(name));

        // Example 2: Using forEach with a Set
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        // Squaring each element of the set and printing using forEach
        System.out.println("\nExample 2:");
        numbers.forEach(number -> System.out.println(number * number));

        // Example 3: Using forEach with a Map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Printing key-value pairs of the map using forEach
        System.out.println("\nExample 3:");
        ageMap.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
    }
}

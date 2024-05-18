package collection;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if the HashSet contains a specific element
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Remove an element from the HashSet
        set.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + set);

        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Iterate over the HashSet
        System.out.println("Iterating over HashSet:");
        for (String element : set) {
            System.out.println(element);
        }

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}

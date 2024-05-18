package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> sortedSet = new TreeSet<>();

        // Add elements to the SortedSet
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Cherry");
        sortedSet.add("Banana"); // Duplicate element

        // Display the SortedSet
        System.out.println("SortedSet: " + sortedSet);

        // Check if the SortedSet contains a specific element
        System.out.println("Contains 'Banana': " + sortedSet.contains("Banana"));

        // Remove an element from the SortedSet
        sortedSet.remove("Cherry");
        System.out.println("SortedSet after removing 'Cherry': " + sortedSet);

        // Get the size of the SortedSet
        System.out.println("Size of SortedSet: " + sortedSet.size());

        // Iterate over the SortedSet
        System.out.println("Iterating over SortedSet:");
        for (String element : sortedSet) {
            System.out.println(element);
        }

        // Clear all elements from the SortedSet
        sortedSet.clear();
        System.out.println("SortedSet after clearing: " + sortedSet);
    }
}

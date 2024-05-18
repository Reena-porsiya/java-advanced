package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Create a LinkedHashSet to store flower names
        LinkedHashSet<String> flowers = new LinkedHashSet<>();

        // Add flower names to the LinkedHashSet
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Rose"); // Duplicate flower name

        // Display the LinkedHashSet of flower names
        System.out.println("Flowers in LinkedHashSet: " + flowers);

        // Check if the LinkedHashSet contains a specific flower name
        System.out.println("Contains 'Rose': " + flowers.contains("Rose"));

        // Remove a flower name from the LinkedHashSet
        flowers.remove("Lily");
        System.out.println("LinkedHashSet after removing 'Lily': " + flowers);

        // Get the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + flowers.size());

        // Iterate over the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String flower : flowers) {
            System.out.println(flower);
        }

        // Clear all elements from the LinkedHashSet
        flowers.clear();
        System.out.println("LinkedHashSet after clearing: " + flowers);
    }
}

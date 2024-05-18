package collection;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Create a Vector
        Vector<String> animals = new Vector<>();

        // Add elements to the Vector
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");

        // Display the Vector
        System.out.println("Initial Vector: " + animals);

        // Access elements from the Vector
        System.out.println("Element at index 1: " + animals.get(1));

        // Update an element at a specific index
        animals.set(1, "Leopard");
        System.out.println("Vector after update: " + animals);

        // Insert an element at a specific position
        animals.add(1, "Giraffe");
        System.out.println("Vector after insertion: " + animals);

        // Remove an element from the Vector
        animals.remove(0);
        System.out.println("Vector after removal: " + animals);

        // Check if the Vector contains a specific element
        System.out.println("Contains 'Elephant': " + animals.contains("Elephant"));

        // Get the size of the Vector
        System.out.println("Size of Vector: " + animals.size());

        // Iterate over the Vector
        System.out.println("Iterating over Vector:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Clear all elements from the Vector
        animals.clear();
        System.out.println("Vector after clearing: " + animals);
    }
}

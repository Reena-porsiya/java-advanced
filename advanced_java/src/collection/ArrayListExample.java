package collection;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display the ArrayList
        System.out.println("Initial ArrayList: " + fruits);

        // Access elements from the ArrayList
        System.out.println("Element at index 1: " + fruits.get(1));

        // Update an element at a specific index
        fruits.set(1, "Blueberry");
        System.out.println("ArrayList after update: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove(0);
        System.out.println("ArrayList after removal: " + fruits);

        // Check if the ArrayList contains a specific element
        System.out.println("Contains 'Orange': " + fruits.contains("Orange"));

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Iterate over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

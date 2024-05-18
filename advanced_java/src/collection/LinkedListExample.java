package collection;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display the LinkedList
        System.out.println("Initial LinkedList: " + fruits);

        // Access elements from the LinkedList
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Element at index 1: " + fruits.get(1));

        // Add an element at the beginning and end of the LinkedList
        fruits.addFirst("Strawberry");
        fruits.addLast("Pineapple");
        System.out.println("LinkedList after additions: " + fruits);

        // Update an element at a specific index
        fruits.set(2, "Blueberry");
        System.out.println("LinkedList after update: " + fruits);

        // Remove elements from the LinkedList
        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove(1);
        System.out.println("LinkedList after removals: " + fruits);

        // Check if the LinkedList contains a specific element
        System.out.println("Contains 'Orange': " + fruits.contains("Orange"));

        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + fruits.size());

        // Iterate over the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

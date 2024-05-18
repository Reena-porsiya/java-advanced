package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {
        // Create a Deque
        Deque<String> animalDeque = new LinkedList<>();

        // Add animals to the front of the Deque
        animalDeque.addFirst("Elephant");
        animalDeque.addFirst("Lion");
        animalDeque.addFirst("Tiger");

        // Add animals to the end of the Deque
        animalDeque.addLast("Giraffe");
        animalDeque.addLast("Zebra");

        // Display the Deque
        System.out.println("Animal Deque: " + animalDeque);

        // Peek at the first and last animals in the Deque
        System.out.println("First animal: " + animalDeque.peekFirst());
        System.out.println("Last animal: " + animalDeque.peekLast());

        // Remove animals from the front and end of the Deque
        System.out.println("Removed first animal: " + animalDeque.removeFirst());
        System.out.println("Deque after removing first animal: " + animalDeque);
        System.out.println("Removed last animal: " + animalDeque.removeLast());
        System.out.println("Deque after removing last animal: " + animalDeque);

        // Check if the Deque contains a specific animal
        System.out.println("Contains 'Lion': " + animalDeque.contains("Lion"));

        // Get the size of the Deque
        System.out.println("Size of the Deque: " + animalDeque.size());

        // Iterate over the Deque from front to end
        System.out.println("Iterating over Deque from front to end:");
        for (String animal : animalDeque) {
            System.out.println(animal);
        }

        // Iterate over the Deque from end to front
        System.out.println("Iterating over Deque from end to front:");
        Deque<String> reverseAnimalDeque = new LinkedList<>(animalDeque);
        while (!reverseAnimalDeque.isEmpty()) {
            System.out.println(reverseAnimalDeque.removeLast());
        }

        // Clear all elements from the Deque
        animalDeque.clear();
        System.out.println("Deque after clearing: " + animalDeque);
    }
}

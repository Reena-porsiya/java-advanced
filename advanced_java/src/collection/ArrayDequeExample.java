package collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        // Adding elements to the end of the deque
        deque.addLast(4);
        deque.addLast(5);

        // Displaying the deque
        System.out.println("ArrayDeque: " + deque);

        // Peeking at the first and last elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements from the front and end
        System.out.println("Removed first element: " + deque.removeFirst());
        System.out.println("Deque after removing first element: " + deque);
        System.out.println("Removed last element: " + deque.removeLast());
        System.out.println("Deque after removing last element: " + deque);

        // Checking if the deque contains a specific element
        System.out.println("Contains 3: " + deque.contains(3));

        // Getting the size of the deque
        System.out.println("Size of the deque: " + deque.size());

        // Iterating over the deque
        System.out.println("Iterating over the deque:");
        for (Integer element : deque) {
            System.out.println(element);
        }

        // Clearing all elements from the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}

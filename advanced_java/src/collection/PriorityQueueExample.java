package collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek at the head of the PriorityQueue
        System.out.println("Head of the queue: " + priorityQueue.peek());

        // Remove elements from the PriorityQueue
        System.out.println("Removed element: " + priorityQueue.poll());
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Check if the PriorityQueue contains a specific element
        System.out.println("Contains 20: " + priorityQueue.contains(20));

        // Get the size of the PriorityQueue
        System.out.println("Size of the PriorityQueue: " + priorityQueue.size());

        // Iterate over the PriorityQueue
        System.out.println("Iterating over PriorityQueue:");
        for (Integer element : priorityQueue) {
            System.out.println(element);
        }

        // Clear all elements from the PriorityQueue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clearing: " + priorityQueue);

        // Check if the PriorityQueue is empty
        System.out.println("Is the PriorityQueue empty? " + priorityQueue.isEmpty());
    }
}

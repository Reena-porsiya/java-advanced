package collection;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the Stack
        System.out.println("Initial Stack: " + stack);

        // Peek at the top element of the Stack
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the Stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the Stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Push another element onto the Stack
        stack.push("Date");
        System.out.println("Stack after pushing 'Date': " + stack);

        // Iterate over the Stack
        System.out.println("Iterating over Stack:");
        for (String fruit : stack) {
            System.out.println(fruit);
        }

        // Clear all elements from the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);

        // Check if the Stack is empty after clearing
        System.out.println("Is the stack empty after clearing? " + stack.isEmpty());
    }
}

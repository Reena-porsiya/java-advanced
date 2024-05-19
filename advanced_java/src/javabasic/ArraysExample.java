package javabasic;

public class ArraysExample {

    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array using index
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculating the sum of elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of elements in the array: " + sum);

        // Modifying an element of the array
        numbers[2] = 35;
        System.out.println("\nAfter modifying an element:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Declaring and initializing an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Accessing elements of the string array using index
        System.out.println("\nNames in the array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }
    }
}

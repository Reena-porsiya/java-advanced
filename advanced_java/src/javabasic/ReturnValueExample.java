package javabasic;

public class ReturnValueExample {

    // Method to calculate the sum of two integers and return the result
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to check if a number is even and return true if it is, otherwise return false
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling the sum method and storing the result in a variable
        int result = sum(5, 3);
        System.out.println("Sum of 5 and 3: " + result);  // Output: 8

        // Calling the isEven method and storing the result in a variable
        boolean isEvenNumber = isEven(10);
        System.out.println("Is 10 even? " + isEvenNumber);  // Output: true
    }
}

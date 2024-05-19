package javabasic;

public class ReturnStatementExample {

    public static void main(String[] args) {
        int result1 = add(5, 3);
        System.out.println("Result 1: " + result1);

        int result2 = multiply(4, 6);
        System.out.println("Result 2: " + result2);

        boolean isPositive = isPositiveNumber(10);
        System.out.println("Is 10 a positive number? " + isPositive);

        String message = getMessage();
        System.out.println("Message: " + message);
    }

    // Method to add two numbers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two numbers and return the result
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to check if a number is positive and return a boolean value
    public static boolean isPositiveNumber(int number) {
        return number > 0;
    }

    // Method to return a string message
    public static String getMessage() {
        return "Hello, World!";
    }
}

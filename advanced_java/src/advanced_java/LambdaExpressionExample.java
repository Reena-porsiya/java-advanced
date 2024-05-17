package advanced_java;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Lambda expression to add two numbers
        Adder adder = (a, b) -> a + b;

        // Adding two numbers using the lambda expression
        int result = adder.add(5, 3);
        System.out.println("Result: " + result);
    }
}

// Functional interface for adding two numbers
interface Adder {
    int add(int a, int b);
}

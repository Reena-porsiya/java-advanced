package advancedjava;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Implementing the Calculator interface using a lambda expression
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        // Using the implemented functional interface
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + performCalculation(x, y, addition));
        System.out.println("Subtraction: " + performCalculation(x, y, subtraction));
        System.out.println("Multiplication: " + performCalculation(x, y, multiplication));
        System.out.println("Division: " + performCalculation(x, y, division));
    }

    // Method to perform calculation using the Calculator interface
    public static int performCalculation(int a, int b, Calculator calculator) {
        return calculator.calculate(a, b);
    }
}

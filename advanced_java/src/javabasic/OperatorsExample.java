package javabasic;

public class OperatorsExample {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("\nRelational Operators:");
        System.out.println("Is equal: " + isEqual);
        System.out.println("Is not equal: " + isNotEqual);
        System.out.println("Is greater: " + isGreater);
        System.out.println("Is less: " + isLess);
        System.out.println("Is greater or equal: " + isGreaterOrEqual);
        System.out.println("Is less or equal: " + isLessOrEqual);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("\nLogical Operators:");
        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("NOT result: " + notResult);

        // Increment and Decrement Operators
        int c = 5;
        c++; // Increment
        int d = 10;
        d--; // Decrement

        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("c after increment: " + c);
        System.out.println("d after decrement: " + d);

        // Conditional Operator (Ternary Operator)
        int num1 = 10;
        int num2 = 20;
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("\nConditional Operator:");
        System.out.println("Maximum between num1 and num2: " + max);
    }
}

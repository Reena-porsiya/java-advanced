package javabasic;
public class ExpressionBlockStatementExample {

    public static void main(String[] args) {
        // Expression: 2 + 3
        int result = 2 + 3;

        // Block
        {
            int a = 5;
            int b = 7;
            int sum = a + b;
            System.out.println("Sum inside block: " + sum);
        }

        // Statement: Declaration and initialization of a variable
        int x = 10;

        // Statement: Assignment
        x = x * 2;

        // Statement: Method call
        printMessage();

        // Statement: Conditional statement
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is not greater than 10");
        }
    }

    // Method to print a message
    public static void printMessage() {
        System.out.println("Inside printMessage method");
    }
}

package javabasic;

public class ContinueStatementExample {

    public static void main(String[] args) {
        // Print odd numbers between 1 and 10
        System.out.println("Odd numbers between 1 and 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Skip even numbers using continue statement
                continue;
            }
            System.out.println(i);
        }
    }
}

package javabasic;

public class ForLoopExample {

    public static void main(String[] args) {
        // Program to print numbers from 1 to 10 using a for loop
        System.out.println("Printing numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Program to calculate the sum of numbers from 1 to 100 using a for loop
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);

        // Program to print even numbers from 1 to 20 using a for loop
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Program to print the Fibonacci series up to the 10th term using a for loop
        System.out.println("Fibonacci series up to the 10th term:");
        int n1 = 0, n2 = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
        }
        System.out.println(); // Move to the next line
    }
}

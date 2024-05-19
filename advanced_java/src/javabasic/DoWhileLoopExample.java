package javabasic;

import java.util.Scanner;

public class DoWhileLoopExample {

    public static void main(String[] args) {
        // Program to print numbers from 1 to 10 using a do-while loop
        System.out.println("Printing numbers from 1 to 10 using a do-while loop:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println(); // Move to the next line

        // Program to calculate the sum of numbers entered by the user using a do-while loop
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Sum of numbers entered: " + sum);

        // Program to print the Fibonacci series up to the 10th term using a do-while loop
        System.out.println("Fibonacci series up to the 10th term using a do-while loop:");
        int n1 = 0, n2 = 1;
        int count = 1;
        do {
            System.out.print(n1 + " ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            count++;
        } while (count <= 10);
        System.out.println(); // Move to the next line

        scanner.close();
    }
}

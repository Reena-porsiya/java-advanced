package javabasic;

import java.util.Scanner;

public class ConditionalStatementsExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // If statement
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }

        // If-else statement
        System.out.println("\nEnter another number:");
        int anotherNumber = scanner.nextInt();

        if (anotherNumber % 2 == 0) {
            System.out.println(anotherNumber + " is even.");
        } else {
            System.out.println(anotherNumber + " is odd.");
        }

        // Else-if ladder
        System.out.println("\nEnter a score (0-100):");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Switch statement
        System.out.println("\nEnter a day number (1-7):");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        scanner.close();
    }
}

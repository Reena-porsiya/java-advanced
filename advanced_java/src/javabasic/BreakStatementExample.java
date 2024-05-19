package javabasic;

public class BreakStatementExample {

    public static void main(String[] args) {
        // Loop to find the first even number in an array
        int[] numbers = {1, 3, 5, 6, 7, 9, 10, 12};
        int firstEvenNumber = -1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                firstEvenNumber = number;
                break; // Break out of the loop when the first even number is found
            }
        }

        if (firstEvenNumber != -1) {
            System.out.println("First even number found: " + firstEvenNumber);
        } else {
            System.out.println("No even number found in the array.");
        }
    }
}

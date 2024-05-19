package javatopics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedExample {

    // Method to add numbers to a list
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("Number list: " + numberList);
    }
}

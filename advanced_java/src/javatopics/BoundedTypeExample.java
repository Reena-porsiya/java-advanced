package javatopics;

public class BoundedTypeExample {

    // Method to calculate the sum of numbers in an array
    public static <T extends Number> double calculateSum(T[] numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("Sum of intArray: " + calculateSum(intArray));
        System.out.println("Sum of doubleArray: " + calculateSum(doubleArray));
    }
}

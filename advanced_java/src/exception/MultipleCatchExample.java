package exception;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }
}

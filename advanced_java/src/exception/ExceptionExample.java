package exception;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero, which will throw an ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the ArithmeticException and printing an error message
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        }
    }

    // A method that attempts to divide two numbers
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

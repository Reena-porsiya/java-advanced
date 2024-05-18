package exception;

public class ChainedExceptionExample {
    public static void main(String[] args) {
        try {
            // Call method that throws an exception
            method1();
        } catch (Exception e) {
            // Catch the exception and print the stack trace
            e.printStackTrace();
        }
    }

    // Method that throws an exception
    static void method1() throws Exception {
        try {
            // Call another method that throws an exception
            method2();
        } catch (Exception e) {
            // Wrap the caught exception in a new exception and throw it
            throw new Exception("Exception in method1", e);
        }
    }

    // Another method that throws an exception
    static void method2() throws Exception {
        // Simulate an error condition
        throw new Exception("Exception in method2");
    }
}

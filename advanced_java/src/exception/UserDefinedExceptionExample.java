package exception;

//Define a custom exception class by extending Exception (or any other appropriate superclass)
class CustomException extends Exception {
 // Constructor that takes a message as input
 public CustomException(String message) {
     // Call the constructor of the superclass (Exception) with the message
     super(message);
 }
}

//Example class that uses the custom exception
public class UserDefinedExceptionExample {
 // Method that may throw the custom exception
 static void checkAge(int age) throws CustomException {
     // Check if age is less than 18, if so, throw CustomException
     if (age < 18) {
         throw new CustomException("You must be at least 18 years old.");
     } else {
         System.out.println("You are eligible.");
     }
 }

 // Main method
 public static void main(String[] args) {
     try {
         // Call the method that may throw the custom exception
         checkAge(15);
     } catch (CustomException e) {
         // Catch and handle the custom exception
         System.out.println("CustomException caught: " + e.getMessage());
     }
 }
}

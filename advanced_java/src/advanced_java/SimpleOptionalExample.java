package advanced_java;

import java.util.Optional;

public class SimpleOptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");

        // Creating an Optional that can hold a null value (currently holds null)
        Optional<String> optionalWithNullableValue = Optional.ofNullable(null);

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Checking if the Optional contains a value
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is present: " + optionalWithValue.get());
        } else {
            System.out.println("No value present in optionalWithValue");
        }

        // Providing a default value if the Optional is empty
        String valueOrDefault = optionalWithNullableValue.orElse("Default Value");
        System.out.println("Value from optionalWithNullableValue or default: " + valueOrDefault);

        // Using ifPresent to perform an action if a value is present
        optionalWithValue.ifPresent(value -> System.out.println("Performing action with: " + value));
    }
}

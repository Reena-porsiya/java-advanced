package advancedjava;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(null);

        // Using Optional to handle the absence of value
        System.out.println(optionalName.orElse("No name provided"));
    }
}

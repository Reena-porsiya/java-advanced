package advancedjava;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class StreamCreationExamples {

    public static void main(String[] args) {
        // 1. From a Collection
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Stream<String> streamFromList = list.stream();
        System.out.println("Stream from List:");
        streamFromList.forEach(System.out::println);

        // 2. From an Array
        String[] array = {"apple", "banana", "orange"};
        Stream<String> streamFromArray = Arrays.stream(array);
        System.out.println("Stream from Array:");
        streamFromArray.forEach(System.out::println);

        // 3. From Static Factory Methods
        // Stream.of()
        Stream<String> streamOfElements = Stream.of("apple", "banana", "orange");
        System.out.println("Stream.of() from elements:");
        streamOfElements.forEach(System.out::println);

        // Stream.iterate()
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
        System.out.println("Stream.iterate():");
        infiniteStream.limit(10).forEach(System.out::println); // Limiting to 10 elements

        // Stream.generate()
        Stream<Double> randomStream = Stream.generate(Math::random);
        System.out.println("Stream.generate():");
        randomStream.limit(5).forEach(System.out::println); // Limiting to 5 elements

        // 4. From File or I/O Operations
        Path path = Paths.get("file.txt");
        try (Stream<String> lines = Files.lines(path)) {
            System.out.println("Stream from File:");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. Using Stream Builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.accept("apple");
        streamBuilder.accept("banana");
        streamBuilder.accept("orange");
        Stream<String> builtStream = streamBuilder.build();
        System.out.println("Stream built using Stream.Builder:");
        builtStream.forEach(System.out::println);

        // 6. From Stream Concatenation
        Stream<String> firstStream = Stream.of("apple", "banana");
        Stream<String> secondStream = Stream.of("orange", "grape");
        Stream<String> concatenatedStream = Stream.concat(firstStream, secondStream);
        System.out.println("Concatenated Stream:");
        concatenatedStream.forEach(System.out::println);
    }
}

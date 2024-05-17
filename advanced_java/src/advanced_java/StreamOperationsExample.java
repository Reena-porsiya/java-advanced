package advanced_java;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {

    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(3, 4, 6, 3, 12, 20, 3, 5, 15, 2);

        // filter: Filters elements based on a predicate
        List<Integer> filteredList = list.stream()
                .filter(num -> num % 2 == 0) // Keep only even numbers
                .collect(Collectors.toList());
        System.out.println("Filtered (even numbers): " + filteredList);

        // map: Transforms elements using a mapping function
        List<String> mappedList = list.stream()
                .map(num -> "Number " + num) // Convert each number to a string with prefix
                .collect(Collectors.toList());
        System.out.println("Mapped (with prefix): " + mappedList);

        // flatMap: Transforms each element into a stream and then flattens the streams into a single stream
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flatMappedList = listOfLists.stream()
                .flatMap(Collection::stream) // Flatten the list of lists into a single stream
                .collect(Collectors.toList());
        System.out.println("FlatMapped: " + flatMappedList);

        // distinct: Removes duplicate elements
        List<Integer> distinctList = list.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList());
        System.out.println("Distinct: " + distinctList);

        // sorted: Sorts elements in natural order
        List<Integer> sortedList = list.stream()
                .sorted() // Sort in natural order
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedList);

        // limit: Limits the number of elements in the stream
        List<Integer> limitedList = list.stream()
                .limit(5) // Keep only the first 5 elements
                .collect(Collectors.toList());
        System.out.println("Limited: " + limitedList);

        // skip: Skips the first n elements of the stream
        List<Integer> skippedList = list.stream()
                .skip(3) // Skip the first 3 elements
                .collect(Collectors.toList());
        System.out.println("Skipped: " + skippedList);
    }
}

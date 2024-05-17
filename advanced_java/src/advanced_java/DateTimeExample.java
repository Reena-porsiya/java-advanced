package advanced_java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parsing date and time
        String dateString = "17-05-2024 14:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Adding days to current date
        LocalDate futureDate = currentDate.plus(10, ChronoUnit.DAYS);
        System.out.println("Future Date (after 10 days): " + futureDate);

        // Subtracting hours from current time
        LocalTime pastTime = currentTime.minus(2, ChronoUnit.HOURS);
        System.out.println("Past Time (2 hours ago): " + pastTime);
    }
}


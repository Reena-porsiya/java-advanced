package javatopics;

public class EnumerationExample {
    // Defining enum within class
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }
    
    // Creating the main method
    public static void main(String[] args) {
        // Printing all enum constants
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        
        // Retrieving an enum constant by name
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
        
        // Getting the ordinal (index) of an enum constant
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
    }
}

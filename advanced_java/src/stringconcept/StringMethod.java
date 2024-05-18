package stringconcept;

public class StringMethod {
    public static void main(String[] args) {
        // Create a string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Character at a specific index
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // Substring from index 7 to the end
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Substring from index 7 to 12
        String substringRange = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);

        // Index of a specific character
        int indexOfComma = str.indexOf(',');
        System.out.println("Index of ',' character: " + indexOfComma);

        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Convert the string to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // Convert the string to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        // Replace characters in the string
        String replacedString = str.replace('l', 'z');
        System.out.println("String with 'l' replaced by 'z': " + replacedString);

        // Split the string into an array of substrings
        String[] parts = str.split(",");
        System.out.println("Split string parts:");
        for (String part : parts) {
            System.out.println(part.trim());
        }

        // Trim leading and trailing whitespace
        String trimmedString = "  Hello, World!  ".trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
    }
}

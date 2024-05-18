package stringconcept;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append some strings
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");

        // Print the StringBuffer
        System.out.println("StringBuffer content: " + stringBuffer);

        // Get the length of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        // Insert a string at a specific position
        stringBuffer.insert(5, ", ");
        System.out.println("StringBuffer after insertion: " + stringBuffer);

        // Delete a portion of the StringBuffer
        stringBuffer.delete(5, 7);
        System.out.println("StringBuffer after deletion: " + stringBuffer);

        // Reverse the StringBuffer
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
    }
}

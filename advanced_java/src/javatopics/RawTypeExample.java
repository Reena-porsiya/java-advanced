package javatopics;

import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
    public static void main(String[] args) {
        List rawList = new ArrayList(); // Raw type
        rawList.add("Hello");
        rawList.add(123); // This is allowed with raw types

        for (Object obj : rawList) {
            System.out.println(obj);
        }

        // The following line will compile but can cause runtime exception
        // String str = (String) rawList.get(1); // Causes ClassCastException
    }
}

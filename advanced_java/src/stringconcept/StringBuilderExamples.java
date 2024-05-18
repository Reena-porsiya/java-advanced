package stringconcept;

import java.lang.StringBuilder;

public class StringBuilderExamples {
    public static void main(String[] args) {
        // StringBuilder charAt
        StringBuilder b = new StringBuilder("Java DataBase Connection");
        System.out.println(b);

        char c = b.charAt(5);
        System.out.println(c);

        char d = b.charAt(9);
        System.out.println(d);

        // StringBuilder equals
        StringBuilder sb = new StringBuilder("Candid Java");
        StringBuilder sb1 = new StringBuilder("Candid Java");

        boolean a = sb1.equals(sb);
        System.out.println(a);

        boolean bEquals = sb.equals(sb);
        System.out.println(bEquals);

        // StringBuilder getChars
        StringBuilder s = new StringBuilder("ArrayList");
        System.out.println(s);

        char[] charArray = new char[20];
        s.getChars(0, 5, charArray, 2);
        System.out.println(charArray);

        // StringBuilder hashCode
        StringBuilder sHashCode = new StringBuilder("Java");
        StringBuilder aHashCode = new StringBuilder("Java");
        StringBuilder bHashCode = new StringBuilder("Spring");

        int s1 = sHashCode.hashCode();
        System.out.println(s1);

        int a1 = aHashCode.hashCode();
        System.out.println(a1);

        int b1 = bHashCode.hashCode();
        System.out.println(b1);

        // StringBuilder indexOf
        StringBuilder sbIndexOf = new StringBuilder("ArrayList and LinkedList");
        System.out.println(sbIndexOf);

        int indexOfList = sbIndexOf.indexOf("List");
        System.out.println(indexOfList);

        // StringBuilder indexOf with fromIndex
        StringBuilder sbIndexOfFromIndex = new StringBuilder("HashMap and HashSet");
        System.out.println(sbIndexOfFromIndex);

        int indexOfHash = sbIndexOfFromIndex.indexOf("Hash", 4);
        System.out.println(indexOfHash);

        // StringBuilder length
        StringBuilder s1Length = new StringBuilder("Inheritance");
        System.out.println(s1Length);

        int length = s1Length.length();
        System.out.println(length);

        // StringBuilder replace
        StringBuilder sReplace = new StringBuilder("StringBuffer");
        System.out.println(sReplace);

        sReplace.replace(6, 12, "Builder");
        System.out.println(sReplace);

        // StringBuilder reverse
        StringBuilder sbReverse = new StringBuilder("Eclipse");
        System.out.println(sbReverse);

        sbReverse.reverse();
        System.out.println(sbReverse);

        // StringBuilder setCharAt
        StringBuilder sbSetCharAt = new StringBuilder("HashSet");
        System.out.println(sbSetCharAt);

        sbSetCharAt.setCharAt(4, 'G');
        System.out.println(sbSetCharAt);

        // StringBuilder subSequence
        StringBuilder sbSubSequence = new StringBuilder("Sub Sequence Method");
        System.out.println(sbSubSequence);

        CharSequence subSeq = sbSubSequence.subSequence(0, 12);
        System.out.println(subSeq);

        // StringBuilder toString
        StringBuilder sbToString = new StringBuilder("Servlet");
        System.out.println(sbToString);

        String str = sbToString.toString();
        System.out.println(str);
    }
}

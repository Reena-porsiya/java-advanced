package Threading;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sample{

    private static final String OUTPUT_FILE = "output1.txt";

    public static void main(String[] args) {
        List<String> thread1Names = new ArrayList<>();
        thread1Names.add("Ram");
        thread1Names.add("Ragul");

        List<String> thread2Names = new ArrayList<>();
        thread2Names.add("Abi");
        thread2Names.add("Kala");

        List<String> thread3Names = new ArrayList<>();
        thread3Names.add("Bala");
        thread3Names.add("Vimala");

        Thread thread1 = new Thread(() -> writeNamesToFile(thread1Names));
        Thread thread2 = new Thread(() -> writeNamesToFile(thread2Names));
        Thread thread3 = new Thread(() -> writeNamesToFile(thread3Names));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void writeNamesToFile(List<String> names) {
        try {
            FileWriter writer = new FileWriter(OUTPUT_FILE, true);
            for (String name : names) {
                writer.write(name + "\n");
                System.out.println(name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


import java.io.*;
import java.util.*;

public class Printer {

    private Scanner reader;
    private File f;

    public Printer(String filename) throws Exception {
        this.f = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(f);
        if (word.equals("")) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}

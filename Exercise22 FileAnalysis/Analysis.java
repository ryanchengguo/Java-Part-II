package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    

    public int characters() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int nChars = 0;

        while (reader.hasNext()) {
            String line = reader.nextLine();
            nChars += line.length() + 1;  // +1 for line breaks
        }

        return nChars;
    }
}

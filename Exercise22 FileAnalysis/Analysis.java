package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int nLines = 0;
        
        while (reader.hasNext()) {
            nLines++;
            reader.nextLine();
        }
        
        return nLines;
    }

   
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

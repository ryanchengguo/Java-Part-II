import java.io.*;
import java.util.*;

public class Printer {

    private Scanner reader;
    private File f;

    public Printer(String filename) throws Exception {
        this.f = new File(filename);
    }

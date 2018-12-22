import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface\n");

        while (true) {
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;

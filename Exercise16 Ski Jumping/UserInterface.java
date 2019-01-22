import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Tournament tournament;

    public UserInterface() {
        reader = new Scanner(System.in);
        tournament = new Tournament();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        addParticipants();
        playTournament();
    }

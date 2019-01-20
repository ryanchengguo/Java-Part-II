import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tournament {

    private List<Participant> participants;
    private Points points;
    private int roundNum;

    public Tournament() {
        this.participants = new ArrayList<Participant>();
        this.points = new Points();
        this.roundNum = 1;
    }
    
    public void addParticipant(String name) {
        participants.add(new Participant(name));
    }

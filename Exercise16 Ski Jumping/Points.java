import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Points {

    private Random random;
    private int length;
    private List<Integer> votes;

    public Points() {

        this.random = new Random();
        // Random int between 60 - 120
        this.length = random.nextInt(61) + 60;
        this.votes = new ArrayList<Integer>();
        generateVotes();
    }

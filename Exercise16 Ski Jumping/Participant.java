import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Participant implements Comparable<Participant> {
    
    private String name;
    private Map<Integer, Points> points;

     public Participant(String name) {
        this.name = name;
        this.points = new HashMap<Integer, Points>();
    }
    
    public String getName() {
        return name;
    }
    
    public void jump(int round) {
        points.put(round, new Points());
    }
    
    public int totalScore() {
        int total = 0;
        
        for (Points p : points.values()) {
            total += p.calculateScore();
        }
        
        return total;
    }

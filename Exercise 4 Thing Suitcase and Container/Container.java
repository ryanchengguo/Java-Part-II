import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Container(int maxWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    

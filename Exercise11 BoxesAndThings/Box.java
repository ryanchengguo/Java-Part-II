import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

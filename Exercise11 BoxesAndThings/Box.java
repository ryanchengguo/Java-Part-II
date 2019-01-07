import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    public double weight() {
        double totalWeight = 0;
        
        for (ToBeStored thing : things) {
            totalWeight += thing.weight();
        }
        
        return totalWeight;
    }

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }
    
    public void printThings() {
        System.out.println("Your suitcase contains the following things:");
        
        for (Thing thing : things) {
            System.out.println(thing);  // Automatically calls "toString()"
        }
    }

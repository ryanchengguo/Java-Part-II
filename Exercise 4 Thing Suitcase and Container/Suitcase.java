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

    public int totalWeight() {
        int totalWeight = 0;
        
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        
        Thing heaviest = things.get(0);
        
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        
        return heaviest;
        
        @Override
        public String toString() {
        int numOfThings = things.size();
        String finalString = "";
        
        switch (numOfThings) {
            case 0:
                finalString += "empty ";
                break;
            case 1:
                finalString += "1 thing ";
                break;
            default:
                finalString += numOfThings + " things ";
                break;
        }        
        finalString += "(" + totalWeight() + " kg)";
        
        return finalString;
    }
}

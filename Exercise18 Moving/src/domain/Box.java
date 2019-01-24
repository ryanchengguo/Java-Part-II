package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > maximumCapacity) {
            return false;
        }
        
        things.add(thing);
        
        return true;
    }

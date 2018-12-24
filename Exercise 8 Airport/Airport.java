import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private ArrayList<Plane> planes;
    private HashMap<Plane, Flight> flights;
    
    public Airport() {
        planes = new ArrayList<Plane>();
        flights = new HashMap<Plane, Flight>();
    }

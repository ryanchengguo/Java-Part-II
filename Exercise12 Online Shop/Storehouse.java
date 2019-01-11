import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Storehouse() {
        productPrices = new HashMap<String, Integer>();
        productStock = new HashMap<String, Integer>();
    }

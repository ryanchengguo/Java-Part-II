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

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (productPrices.containsKey(product)) {
            return productPrices.get(product);
        }
        
        return -99;
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        
        return 0;
    }

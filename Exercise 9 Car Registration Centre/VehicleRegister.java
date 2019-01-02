import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        
        owners.put(plate, owner);
        
        return true;
    }

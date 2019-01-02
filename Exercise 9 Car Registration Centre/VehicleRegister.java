import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

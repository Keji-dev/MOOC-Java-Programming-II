
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }   
    
    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        
        
        for (String unit: storage.keySet()) {
            if (!(storage.get(unit).isEmpty())) {
                storageUnits.add(unit);
            }
        }
        
        return storageUnits;   
    }
}

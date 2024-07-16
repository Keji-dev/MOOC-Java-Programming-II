import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) { // 
        if (!(registry.containsKey(licensePlate))) { //si el registro no contiene el key matricula
            registry.put(licensePlate, owner); // agregamos matricula y dueno al hashmap
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) { // Obtenemos el valor del key que hemos enviado
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) { //Si el hashmap contiene el key de la matricula, lo eliminamos
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }  
        return false;
    }
    
    public void printLicensePlates() { //Imprimimos las matriculas linea por linea usando el for each
        for(LicensePlate plate: registry.keySet()) { //Para objeto LicensePlate imprimimos matriculas de el contenido del key en el hashmap
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>(); // Creamos una lista para guardar los duenos
      
        for(String owner: registry.values()) { // Iteramos sobre todos los duenos que contiene el hashmap usando .values()
            if(!(owners.contains(owner))) { // Si el arraylist no contiene el dueno enviado desde el hashmap, se agrega a la arraylist, de lo contrario se ignora
                owners.add(owner);
            }
        }
        
        for(String owner: owners) { // Imprimimos los duenos, linea por linea usando el for each
            System.out.println(owner);
        }
    }   
}

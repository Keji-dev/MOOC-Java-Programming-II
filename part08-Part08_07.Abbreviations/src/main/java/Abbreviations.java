
import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) { // Agrega una abreviacion y explicacion ambos de tipo String al hashmap
        abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) { // Metodo para saber si la abreviacion existe en el hashmap, requiere de una abreviacion para comparar con la lista hashmap
        if (abbreviations.containsKey(abbreviation)) { // Si el hashmap abbreviations.containsKey contiene la abbreviation enviada por el main, devuelve true
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation) { // Metodo para obtener el String explanation cuando enviamos el valor de abbreviation
        if (abbreviations.containsKey(abbreviation)) { // Si el hashmap abbreviations.containsKey contiene la abbreviation enviada por el main
            return this.abbreviations.get(abbreviation); // devuelve este.hashmap.obten(abreviacion)
        }
        
        
        return null;
    }
}

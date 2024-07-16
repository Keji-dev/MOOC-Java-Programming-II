
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary; // Creamos un hashmap de tipo string (para la palabra) y ArrayList (para todas las traducciones)

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>(); // Declaramos la creacion de un hashmap cada vez que usemos el constructor
    }
    
    public void add(String word, String translation) { // Metodo para agregar la palabra y sus traducciones
        this.dictionary.putIfAbsent(word, new ArrayList<>()); // putIfAbsent asegura que se inicia la lista si no existe
        
        this.dictionary.get(word).add(translation);  // Agregamos al key word, las traducciones a nuestra lista     
    }
    
    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>()); //usamos getOrDefault si la clave no esta en el hashmap, este metodo devolvera un arrayList vacio por defecto
    }
    
    public void remove(String word) {
            dictionary.remove(word); //removemos el key y el valor asociado
    }  
}

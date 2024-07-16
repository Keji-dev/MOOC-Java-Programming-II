
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, String> hashmap = new HashMap<>(); // Creamos un nuevo HashMap con doble tipo String
        hashmap.put("f.e", "for example"); // Agregamos los valores, en el HashMap no hay orden de indice
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i"); // Invoco al metodo enviandole una lista hashmap y un dato tipo String, esto devolvera todos los key que contenga la letra "i"
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e"); // Invoco al metodo enviandole una lista hashmap y un dato tipo String, esto devolvera todos los valores de key que contenga la letra "i"
        
    }
    
    public static void printKeys(HashMap<String, String> hashMap) { // El metodo requiere un HashMap,
        for(String key: hashMap.keySet()) { // Para valor de key necesitamos coger todos los key del hashmap usando keySet() esto recorre todos los key que hay en el hashmap
            System.out.println(key); // Imprime todos los key del hashmap
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashMap, String text) { // El metodo requiere un hashmap y un dato de tipo String
        for(String key: hashMap.keySet()) { // Obtenemos todos los keys y los recorremos con .keySet()
            if(key.contains(text)) { // Si el key contiene algun dato (en este caso alguna letra) la cual hallamos enviado desde el main, sera true
                System.out.println(key); // e imprimira el contenido de cada key
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) { // El metodo requiere un hashmap y un dato de tipo String
        for(String key: hashMap.keySet()) { // Obtenemos todos los keys y los recorremos con .keySet()
            if(key.contains(text)) { // // Si el key contiene algun dato (en este caso alguna letra) la cual hallamos enviado desde el main, sera true
                System.out.println(hashMap.get(key)); // e imprimira en este caso el valor que contenga cada key
            }
        }
    }
}

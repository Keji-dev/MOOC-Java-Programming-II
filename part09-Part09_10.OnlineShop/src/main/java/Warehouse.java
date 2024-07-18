import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    // Mapa para almacenar los precios de los productos
    private Map<String, Integer> totalPrice;
    // Mapa para almacenar las cantidades de stock de los productos
    private Map<String, Integer> totalStock;

    // Constructor para inicializar los mapas
    public Warehouse() {
        this.totalPrice = new HashMap<>();
        this.totalStock = new HashMap<>();
    }
    
    // Método para agregar un producto al almacén
    public void addProduct(String product, int price, int stock) { 
        // Si el producto ya existe en el almacén, sumamos el stock adicional al existente
        if (totalStock.containsKey(product)) {
            stock += totalStock.get(product);
        }
        // Actualizamos o agregamos el precio del producto
        totalPrice.put(product, price);
        // Actualizamos o agregamos el stock del producto
        totalStock.put(product, stock);   
    }
    
    // Método para obtener el precio de un producto
    public int price(String product) {
        // Devolvemos el precio si el producto existe, de lo contrario devolvemos -99
        return totalPrice.getOrDefault(product, -99);
    }
    
    // Método para obtener el stock de un producto
    public int stock(String product) {
        // Devolvemos el stock si el producto existe, de lo contrario devolvemos 0
        return totalStock.getOrDefault(product, 0);
    }
    
    // Método para reducir el stock de un producto en una unidad
    public boolean take(String product) {
        // Verificamos si el producto existe en el almacén
        if (totalStock.containsKey(product)) {
            int stock = totalStock.get(product);
            // Si el stock es mayor a 0, reducimos el stock en una unidad
            if (stock > 0) {
                totalStock.put(product, stock - 1);
                return true;
            }      
        }
        return false;
    }
    
    // Método para obtener un conjunto con los nombres de todos los productos
    public Set<String> products() {
        return totalPrice.keySet();
    }
}
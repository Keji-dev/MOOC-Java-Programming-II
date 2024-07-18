import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    // Mapa para almacenar los productos en el carrito de compras
    private Map<String, Item> shoppingCart;

    // Constructor para inicializar el mapa
    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    // Método para agregar un producto al carrito de compras
    public void add(String product, int price) {
        // Si el producto ya está en el carrito, incrementa su cantidad
        if (this.shoppingCart.containsKey(product)) {
            this.shoppingCart.get(product).increaseQuantity();
        } else {
            // Si el producto no está en el carrito, lo agrega con cantidad 1
            shoppingCart.put(product, new Item(product, 1, price));
        }
    }
    
    // Método para calcular el precio total de todos los productos en el carrito
    public int price() {
        int total = 0;
        // Suma el precio de cada producto en el carrito
        for (Item product : shoppingCart.values()) {
            total += product.price();
        }
        return total;
    }

    // Método para imprimir los detalles de todos los productos en el carrito
    public void print() {
        // Itera directamente a través de los valores del mapa y los imprime
        for (Item product : shoppingCart.values()) {
            System.out.println(product);
        }
    }

}

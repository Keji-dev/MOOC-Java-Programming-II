public class Item {
    
    // Nombre del producto
    private String product;
    // Cantidad del producto
    private int qty;
    // Precio unitario del producto
    private int unitPrice;

    // Constructor para inicializar un nuevo objeto Item con su nombre, cantidad y precio unitario
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Método para calcular el precio total (precio unitario * cantidad)
    public int price() {
        return unitPrice * qty;
    }
    
    // Método para incrementar la cantidad del producto en 1
    public void increaseQuantity() {
        qty++;
    }

    // Método toString sobrescrito para proporcionar una representación en forma de cadena del objeto Item
    @Override
    public String toString() {
        return product + ": " + qty;
    }
}

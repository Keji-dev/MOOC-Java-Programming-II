
public class ProductWarehouse extends Warehouse { // Extendemos de la clase Warehouse por lo que podemos usar sus metodos
    
    private String productName; // Declaramos una variable para darle nombre a nuestros productos

    public ProductWarehouse(String productName, double capacity) { // Constructor usando el atributo capacity de nuestra super class
        super(capacity); // los atributos de nuestra superclase debe usarse super y estar en la primera linea del constructor
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }
    
    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() { // devolvemos el nombre del producto y el toString que hemos creado en la superclase
        return this.productName + ": " + super.toString();
    }
    
    
    
}

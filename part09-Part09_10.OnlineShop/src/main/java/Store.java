import java.util.Scanner;

public class Store {

    // Almacén que contiene los productos disponibles en la tienda
    private Warehouse warehouse;
    // Escáner para leer la entrada del usuario
    private Scanner scanner;

    // Constructor para inicializar el almacén y el escáner
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // Método que maneja la visita del cliente a la tienda
    public void shop(String customer) {
        // Crear un nuevo carrito de compras para el cliente
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection:");

        // Mostrar la selección de productos disponibles en el almacén
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        // Bucle para manejar la selección de productos por parte del cliente
        while (true) {
            System.out.println();
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            // Si el cliente presiona enter sin escribir nada, salir del bucle
            if (product.isEmpty()) {
                break;
            }
            
            // Verificar si el producto está en stock
            if (warehouse.stock(product) != 0) {
                // Reducir el stock en el almacén y agregar el producto al carrito
                warehouse.take(product);
                cart.add(product, warehouse.price(product));
            } else {
                // Informar al cliente que el producto no está en stock
                System.out.println("Sorry, " + product + " is out of stock.");
            }
        }

        // Mostrar el contenido del carrito de compras y el precio total
        System.out.println("Your shopping cart contents:");
        cart.print();
        System.out.println("Total: " + cart.price());
    }

    // Método principal para ejecutar la tienda
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("bread", 2, 5);
        warehouse.addProduct("cheese", 5, 20);

        Store store = new Store(warehouse, scanner);
        store.shop("Customer Name");

        scanner.close(); // Cerrar el escáner al final para liberar recursos
    }
}

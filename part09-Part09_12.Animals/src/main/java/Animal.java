// Clase abstracta Animal que sirve como base para otros tipos de animales.
public abstract class Animal {
    
    // Campo privado que almacena el nombre del animal.
    private String name;

    // Constructor que inicializa el nombre del animal.
    public Animal(String name) {
        this.name = name;
    }

    // Constructor sin parámetros, que permite crear un Animal sin especificar el nombre.
    public Animal() {
    }
    
    // Método que simula que el animal come, imprimiendo un mensaje en la consola.
    public void eat() {
        System.out.println(this.name + " eats");
    }
    
    // Método que simula que el animal duerme, imprimiendo un mensaje en la consola.
    public void sleep() {
        System.out.println(this.name + " sleeps");
    }
    
    // Método que devuelve el nombre del animal.
    public String getName() {
        return this.name;
    }
}

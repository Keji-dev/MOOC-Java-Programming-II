// La clase Dog extiende la clase Animal e implementa la interfaz NoiseCapable.
public class Dog extends Animal implements NoiseCapable {

    // Constructor que acepta un nombre y lo pasa al constructor de la clase base (Animal).
    public Dog(String name) {
        super(name);
    }
    
    // Constructor sin parámetros que llama al constructor de la clase base (Animal) con el nombre "Dog".
    public Dog() {
        super("Dog");
    }
    
    // Método específico de Dog que imprime un mensaje indicando que el perro ladra.
    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    // Implementa el método makeNoise de la interfaz NoiseCapable, que llama al método bark.
    @Override
    public void makeNoise() {
        this.bark();
    }
    
    // Los métodos getName, sleep y eat se heredan directamente de la clase Animal,
    // no es necesario sobrescribirlos si no se modifica su comportamiento.
}

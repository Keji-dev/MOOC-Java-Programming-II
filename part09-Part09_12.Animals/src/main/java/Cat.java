
public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) { // Constructor el cual pide el nombre en el main 
        super(name);
    }

    public Cat() { // Constructor el cual si no le dan un nombre al gato, simplemente se llamara Gato
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs"); // Obtenemos el nombre del gato y hacemos su sonido
    }
    
    @Override
    public void makeNoise() {
        this.purr(); // Usamos el metodo del super ya que tambien se comparte con otros animales
    }
    
    // Los métodos getName, sleep y eat se heredan directamente de la clase Animal,
    // no es necesario sobrescribirlos si no se modifica su comportamiento.
}

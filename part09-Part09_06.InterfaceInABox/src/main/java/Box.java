
import java.util.ArrayList;


public class Box implements Packable {

    private double maxWeight;
    private double packablesWeight;
    private ArrayList<Packable> packables;

    public Box(double maxWeight) {
        this.packables = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add(Packable packable){ 
        if (this.weight() + packable.weight() <= this.maxWeight) {
            this.packables.add(packable);
        }
    }

    @Override
    public double weight() {   // Este método es público y devuelve un valor de tipo double
        double weight = 0; // Se declara e inicializa una variable weight con valor 0. Esta variable se utilizará para acumular el peso total.
        
        for (Packable packable: this.packables) { //  Este bucle itera sobre cada objeto packable en la colección this.packables
            weight += packable.weight(); // En cada iteración del bucle, se suma el peso del objeto packable actual al weight acumulado.
        }
        
        return weight; // Finalmente, el método retorna el peso total acumulado.
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
}

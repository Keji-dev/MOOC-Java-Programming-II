import java.util.ArrayList;

// Clase Herd que implementa la interfaz Movable.
public class Herd implements Movable {
    private ArrayList<Movable> herd; // Lista de objetos movibles en el rebaño.

    public Herd() {
        this.herd = new ArrayList<>(); // Inicializa la lista de objetos movibles.
    }

    // Método para agregar un objeto movible al rebaño.
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        // Itera sobre todos los objetos en el rebaño y los mueve.
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Utiliza StringBuilder para construir eficientemente la cadena.
        // Itera sobre todos los objetos en el rebaño y añade su representación de cadena al StringBuilder.
        for (Movable row : herd) {
            sb.append(row.toString()).append("\n");
        }
        return sb.toString();
    }
}

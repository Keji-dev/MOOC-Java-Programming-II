// Clase Organism que implementa la interfaz Movable.
public class Organism implements Movable {
    private int x; // Coordenada x del organismo.
    private int y; // Coordenada y del organismo.

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx; // Mueve el organismo en la dirección x.
        this.y += dy; // Mueve el organismo en la dirección y.
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y; // Devuelve una representación del organismo.
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }
    
    public void add(Card card) {
        // Agregar una carta a la mano.
        cardsInHand.add(card);
    }
    
    public void print() {
        // Imprimir todas las cartas en la mano.
        cardsInHand.forEach(System.out::println);
    }
    
    public void sort() {
        // Ordenar las cartas en la mano.
        Collections.sort(cardsInHand);
    }

    @Override
    public int compareTo(Hand o) {     
        // Sumar los valores de las cartas en la mano actual.
        int comparison = cardsInHand.stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        // Sumar los valores de las cartas en la otra mano.
        int comparison2 = o.cardsInHand.stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        // Comparar la suma de los valores de las cartas.
        return comparison - comparison2;
    }
   
    public void sortBySuit() {
        // Ordenar las cartas en la mano por palo y valor.
        Collections.sort(cardsInHand, new BySuitInValueOrder());
    }
}

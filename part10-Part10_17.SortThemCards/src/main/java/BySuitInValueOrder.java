import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        // Comparar primero por el palo.
        int suitComparison = o1.getSuit().compareTo(o2.getSuit());
        
        if (suitComparison != 0) {
            return suitComparison;
        }
        // Si los palos son iguales, comparar por el valor.
        return Integer.compare(o1.getValue(), o2.getValue());
    } 
}

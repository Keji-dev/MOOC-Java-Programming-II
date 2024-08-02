public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        // Validar que el valor de la carta esté en el rango 2...14.
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        // Convertir el valor de la carta a su representación como string.
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card o) {
        // Comparar primero por el valor de la carta.
        if (this.value != o.getValue()) {
            return Integer.compare(this.value, o.value);
        }
        // Si los valores son iguales, comparar por el palo.
        return this.suit.compareTo(o.getSuit());
    }
}

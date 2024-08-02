public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.add(new Card(10, Suit.HEART));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(11, Suit.CLUB));
        
        System.out.println("Mano sin ordenar:");
        hand.print();
        
        hand.sortBySuit();
        
        System.out.println("Mano ordenada por palo y valor:");
        hand.print();
    }
}

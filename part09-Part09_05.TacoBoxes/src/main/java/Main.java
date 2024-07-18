
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        TripleTacoBox box1 = new TripleTacoBox();
        
        System.out.println(box1.tacosRemaining());
        box1.eat();
        System.out.println(box1.tacosRemaining());
    }   
}

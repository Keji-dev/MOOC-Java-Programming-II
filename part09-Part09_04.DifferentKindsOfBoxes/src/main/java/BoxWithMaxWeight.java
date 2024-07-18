
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {       
        if (item.getWeight() <= this.capacity) {
            items.add(item);
            this.capacity -= item.getWeight();
        }
    }
     
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}

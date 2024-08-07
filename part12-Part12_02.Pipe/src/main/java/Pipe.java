
import java.util.ArrayList;
import java.util.Iterator;


public class Pipe<T> {
    
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        values.add(value);
    }
    
    public T takeFromPipe() {
        Iterator<T> iterator = values.iterator();
        if (iterator.hasNext()) {
            T element = iterator.next();
            iterator.remove();
            return element;
        }
        return null;
    }
    
    public boolean isInPipe() {
        return !values.isEmpty();
    }
    
}

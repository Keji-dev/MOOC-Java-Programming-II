
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hideout<T> {
    
    private List<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        hideout.clear();
        hideout.add(toHide);
    }
    
    public T takeFromHideout() {
         
        Iterator<T> iterator = hideout.iterator();
        if (iterator.hasNext()) {
            T element = iterator.next();
            iterator.remove();
            return element;
        }
        return null;
    }
    
    public boolean isInHideout() {
        return !hideout.isEmpty();
    }
}


import java.util.ArrayList;
import java.util.Collections;


public class ChangeHistory {
    
    private ArrayList<Double> history; // Creamos un ArrayList para guardar todos los movimientos del balance

    public ChangeHistory() {
        this.history = new ArrayList<>(); // Inicializamos el ArrayList en nuestro constructor
    }
    
    public void add(double status) { // Agregamos la cantidad del balance
        history.add(status);
    }
    
    public void clear() { // Limpiar el historial
        history.clear();
    }
    
    public double maxValue() { //Devolvemos la maxima cantida del arrayList
        return Collections.max(history);
    }
    
    public double minValue() { //Devolvemos la minima cantida del arrayList
        return Collections.min(history);
    }
    
    public double average() { // Calculamos el average de todos los movimientos en el historial
        double sum = 0;
        double average = 0;
        
        for (Double value: history) {
            sum += value;     
        }
        
        average = sum / history.size(); 
        return average;
    }

    @Override
    public String toString() { // devolvemos los valores del arraylist para poder imprimirlos
        return history.toString();
    }
    
    
}

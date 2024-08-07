package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    // Lista de sensores agregados
    private final ArrayList<Sensor> sensorList;
    // Lista de lecturas promedio tomadas (almacenadas como Double para precisión)
    private final List<Double> readings;

    // Constructor que inicializa las listas de sensores y lecturas
    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    // Método para agregar un sensor a la lista de sensores
    public void addSensor(Sensor sensor) {
        this.sensorList.add(sensor);
    }
    
    @Override
    // Verifica si al menos uno de los sensores está encendido
    public boolean isOn() {
        // Usa un flujo para verificar si cualquier sensor está encendido
        return sensorList.stream().anyMatch(Sensor::isOn);
    }

    @Override
    // Enciende todos los sensores en la lista de sensores
    public void setOn() {
        sensorList.forEach(Sensor::setOn);
    }

    @Override
    // Apaga todos los sensores en la lista de sensores
    public void setOff() {
        sensorList.forEach(Sensor::setOff); 
    }

    @Override
    // Lee los valores de todos los sensores, calcula el promedio y lo añade a las lecturas
    public int read() {
        // Si no hay sensores en la lista, lanza una excepción
        if (sensorList.isEmpty()) {
            throw new IllegalStateException("Be sure you added any sensor");
        }
        
        // Usa un flujo para sumar todas las lecturas de los sensores
        double sum = sensorList.stream()
                .mapToInt(Sensor::read)
                .sum();
        
        // Calcula el promedio dividiendo la suma por el número de sensores
        double average = sum / sensorList.size();
        
        // Añade el promedio a la lista de lecturas
        readings.add(average);
        
        // Devuelve el promedio calculado redondeado al entero más cercano
        return (int) Math.round(average);
    }
    
    // Devuelve la lista de todas las lecturas promedio tomadas
    public List<Double> readings() {
        // Devuelve una nueva lista para proteger los datos internos
        return new ArrayList<>(readings);
    }
}


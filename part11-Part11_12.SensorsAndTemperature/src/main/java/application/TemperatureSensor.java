package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    
    // Variable para almacenar la temperatura generada
    private int temperature;
    // Variable para almacenar el estado del sensor (encendido/apagado)
    private boolean onOrOff;
    // Generador de números aleatorios
    private final Random random = new Random();
    // Variable para verificar si la temperatura ya ha sido generada
    private boolean generatedTemperature;

    @Override
    // Verifica si el sensor está encendido
    public boolean isOn() {
        return onOrOff;
    }

    @Override
    // Enciende el sensor
    public void setOn() {
        this.onOrOff = true;
    }

    @Override
    // Apaga el sensor
    public void setOff() {
        this.onOrOff = false;
        this.generatedTemperature = false; // Resetear la temperatura generada al apagar
    }

    @Override
    // Lee la temperatura si el sensor está encendido
    public int read() {
        if (!onOrOff) {
            // Si el sensor está apagado, lanza una excepción
            throw new IllegalStateException("The sensor is off");
        }
       
        if (!generatedTemperature) {
            int min = -30;
            int max = 30;
            // Genera un número aleatorio entre min y max
            this.temperature = generateRandomNumber(min, max);
            // Marca que la temperatura ha sido generada
            generatedTemperature = true;
        }
        
        return this.temperature;
    }
    
    // Método para generar un número aleatorio en un rango especificado
    public int generateRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min; // Asegura que el valor esté entre min y max, inclusivo
    }
}

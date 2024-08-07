package application;

public class Program {

    public static void main(String[] args) {
        
        Sensor sensor1 = new TemperatureSensor();
        sensor1.setOn();
        System.out.println("krakow is: " + sensor1.read() + " degrees");
        
        Sensor sensor2 = new TemperatureSensor();
        sensor2.setOn();
        System.out.println("katowice is: " + sensor2.read() + " degrees");

        AverageSensor poland = new AverageSensor();
        poland.addSensor(sensor1);
        poland.addSensor(sensor2);

        poland.setOn();
        System.out.println("Temperature in Helsinki region " + poland.read() + " degrees Celsius"); 
    
  
    
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
      
        
        System.out.println("Input numbers, type 'end' to stop");
        while (true) {           
            String input = scanner.nextLine().toLowerCase();
                       
            if (input.equalsIgnoreCase("end")) {   
                break;
            }        
            inputs.add(input);               
        }
        
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble(); 
        
        System.out.println("average of the numbers: " + average);
    }
}

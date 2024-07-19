
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        String input;
        
        System.out.println("input numbers, type 'end' to stop");
        while (true) {
            input = scanner.nextLine().toLowerCase();
            
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(input);
        }
        
        
        System.out.println("Printe the average of the negative numbers or the positiv numbers? (n/p)");
        input = scanner.nextLine().toLowerCase();
        
        if(input.equalsIgnoreCase("p")) {
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
        
        if(input.equalsIgnoreCase("n")) {
            double averageNegative = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageNegative);
        }
    }
}

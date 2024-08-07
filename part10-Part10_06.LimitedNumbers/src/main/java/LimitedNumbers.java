
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            input = scanner.nextInt();
            
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }
        
        numbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(number -> System.out.println(number));
    }
}

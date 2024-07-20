
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> words = new ArrayList<>();
        
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            words.add(input);
        }
        
        words.stream()
                .forEach(word -> System.out.println(word));
    }
}

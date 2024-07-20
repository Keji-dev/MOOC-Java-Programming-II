
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 4, 2, 6, -7, -5));
        List<Integer> positiveNumbers = positive(list);
        
        System.out.println(list);
        System.out.println(positiveNumbers);
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> values = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }

}

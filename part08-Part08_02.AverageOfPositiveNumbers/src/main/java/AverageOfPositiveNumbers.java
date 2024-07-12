
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while(true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                break;
            }
            
            if (num >= 1) {    
                sum += num;
                count++;
            }
        }
        
        if (count >= 1) {
            System.out.println((double) sum / count);
        }
    }
}

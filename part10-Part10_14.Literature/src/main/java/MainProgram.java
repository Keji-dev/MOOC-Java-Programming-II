import java.util.*;

public class MainProgram {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;
            String ageInput;

            List<Book> books = new ArrayList<>();

            while (true) {
                System.out.println("Input the name of the book, empty stops:");
                input = scanner.nextLine();

                if (input.isEmpty()) {
                    break;
                }

                System.out.println("Input the age recommendation:");
                ageInput = scanner.nextLine();
                System.out.println();

                try {
                    int age = Integer.parseInt(ageInput);
                    books.add(new Book(input, age));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age recommendation. Please enter a valid number.");
                }

            }

            Comparator<Book> comparator = Comparator
                     .comparing(Book::getAge)
                     .thenComparing(Book::getName);

            books.sort(comparator);
            
            System.out.println(books.size() + " books in total.");

            books.forEach(System.out::println);

        }
    }


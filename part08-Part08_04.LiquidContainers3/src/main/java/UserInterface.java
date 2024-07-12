import java.util.Scanner;

public class UserInterface {


    private Scanner scan = new Scanner(System.in);

    private Container container = new Container();

    public void start() {

        while (true) {
            System.out.println(container.toString());

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("Invalid command");
                continue;
            }

            String command = parts[0];
            int amount = 0;

            try {
                amount = Integer.valueOf(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount");
                continue;
            }

            if (command.equalsIgnoreCase("add")) {
                container.add(amount);
            } else if (command.equalsIgnoreCase("move")) {
                container.move(amount);
            } else if (command.equalsIgnoreCase("remove")) {
                container.remove(amount);
            } else {
                System.out.println("Invalid command");
            }

        }
    }
}

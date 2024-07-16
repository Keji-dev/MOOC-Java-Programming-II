import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        boolean shouldLoop = true;

        while(shouldLoop) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            switch(input) {

                case "stop":
                    shouldLoop = false;
                    break;

                case "add":
                    System.out.println("To add:");
                    input = scanner.nextLine();
                    todoList.add(input);
                    continue;

                case "list":
                    todoList.print();
                    continue;


                case "remove":
                    System.out.println("Which one is removed?");
                    int taskToBeRemoved = Integer.valueOf(scanner.nextLine());
                    todoList.remove(taskToBeRemoved);
            }
        }
    }
}

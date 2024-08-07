package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;
    private Todo todo;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            switch(command) {
                case "1":
                    list();
                    break;
       
                case "2":
                    add();
                    break;
                
                case "3":
                    markAsDone();
                    break;
                    
                case "4":
                    remove();
                    break;
                                      
                default:
                    System.out.println("Unkown command");
                    break;
            }
        }

        System.out.println("Thank you!");
    }
    
    public void list() throws SQLException {
        System.out.println("Listing the database contents");
                    List<Todo> list = database.list();
                    list.forEach(task -> {
                        System.out.println(task);
                    });
    }
    
    public void add() throws SQLException {
    System.out.println("Adding a new todo");
    System.out.println("Enter name");
    String name = scanner.nextLine();
    System.out.println("Enter a description");
    String description = scanner.nextLine();
    Todo task = new Todo(name, description, Boolean.FALSE);
    database.add(task);
    }
    
    public void markAsDone() throws SQLException {
    System.out.println("Which todo should be marked as done (give the id)?");
    int id = Integer.parseInt(scanner.nextLine());
    database.markAsDone(id);
    }
    
    public void remove() throws SQLException {
    System.out.println("Which todo should be removed (give the id)?");
    int id = scanner.nextInt();
    database.remove(id);
    }

}

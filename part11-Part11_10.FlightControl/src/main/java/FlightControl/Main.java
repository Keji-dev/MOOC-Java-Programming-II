package FlightControl;

import FlightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();
        TextUI ui = new TextUI(control, scanner);
        ui.start();
    }
}

import java.util.Scanner;

import controller.MenuController;
import model.Menu;
import utilities.GeneradorDatos;
import view.MenuView;

public class App {
    public static void main(String[] args) {
        MenuView menuView = new MenuView(new MenuController(new Menu(
                GeneradorDatos.generarDatos())), new Scanner(System.in));

        menuView.elegirOpcion();
    }
}

package view;

import java.util.Scanner;

import controller.MenuController;

public class MenuView {
    MenuController menuController;
    Scanner scanner;

    public MenuView(MenuController menuController, Scanner scanner) {
        this.menuController = menuController;
        this.scanner = scanner;
    }

    public void dataEnter() {
        System.out.println("Ingresando los datos del menu...");

    }

    public void elegirOpcion() {

        while (true) {
            System.out.println("Por favor elija una opcion debajo... \n\n [1]--> Agregar Plato\n[2]--> Listar Precios");
            try {
                int eleccion = scanner.nextInt();
                if (eleccion == 0) {
                    System.out.println("Se ha decidido finalizar con el programa, muchas gracias por su uso!");
                    break;
                }
                if (eleccion < 1 || eleccion > 2) {
                    System.out.println(
                            "El valor elegido esta fuera sobre el rango valido, intentelo de nuevo por favor...");

                }
                switch (eleccion) {
                    case 1:
                        agregarPlatoAlMenu();
                        break;

                    case 2:
                        visualizarPreciosDelMenu();
                        break;
                }

            } catch (Exception e) {
                System.err.println("Se ha elegido un valor que no es valido, intentelo de nuevo...");
            }

        }
    }

    public void agregarPlatoAlMenu() {
        System.out.println("Funcion de agregar platos...");

    }

    public void visualizarPreciosDelMenu() {
        menuController.devolverPreciosMenu().forEach((nombre, precio) -> {
            System.out.println(nombre + " ---- $" + precio);
        });
    }

}

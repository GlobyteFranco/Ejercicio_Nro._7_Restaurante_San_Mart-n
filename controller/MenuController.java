package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Menu;
import model.Plato;

public class MenuController {
    Menu menu;

    public MenuController(Menu menu) {
        this.menu = menu;
    }

    public void agregarPlato(Plato plato) {
        this.menu.agregarPlato(plato);
    }

    public Map<String, Integer> devolverPreciosMenu() {
        Map<String, Integer> returnMenu = new HashMap<>();
        this.menu.getMenu().forEach((plato) -> {
            returnMenu.put(plato.getNombre(), plato.devolverPrecio());
        });
        return returnMenu;
    }

}

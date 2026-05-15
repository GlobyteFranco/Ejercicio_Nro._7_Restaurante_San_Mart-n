package model;

import java.util.List;

public class Menu {
    List<Plato> menu;

    public Menu(List<Plato> menu) {
        this.menu = menu;
    }

    public List<Plato> getMenu() {
        return menu;
    }

    public void agregarPlato(Plato platoAgregado) {
        this.menu.add(platoAgregado);
    }

}

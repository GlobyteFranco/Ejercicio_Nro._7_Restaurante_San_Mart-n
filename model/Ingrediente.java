package model;

public class Ingrediente implements UnidadGastronomica {

    private Ingredientes nombre;
    private int precio;

    public Ingrediente(Ingredientes nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int devolverPrecio() {
        return getPrecio();
    }

    public Ingredientes getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

}

package model;

import java.util.List;

public class Plato implements UnidadGastronomica {
    private List<UnidadGastronomica> contenidoPlato;
    private String nombre;

    public Plato(List<UnidadGastronomica> contenidoGastronomico, String nombrePlato) {
        this.contenidoPlato = contenidoGastronomico;
        this.nombre = nombrePlato;
    }

    @Override
    public int devolverPrecio() {
        int precioFinal = 0;
        for (UnidadGastronomica ingrediente : contenidoPlato) {
            precioFinal += ingrediente.devolverPrecio();
        }
        return precioFinal;

    }

    public void agregarIngrediente(UnidadGastronomica ingredienteAgregar) {
        this.contenidoPlato.add(ingredienteAgregar);
    }

    public String getNombre() {
        return nombre;
    }

}

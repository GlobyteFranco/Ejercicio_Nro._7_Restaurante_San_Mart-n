package utilities;

import model.Ingrediente;
import model.Ingredientes;
import model.Plato;
import model.UnidadGastronomica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneradorDatos {// Datos hardcodeados con IA xd

    public static List<Plato> generarDatos() {
        List<Plato> cartaMenu = new ArrayList<>();

        Ingrediente bifeChorizo = new Ingrediente(Ingredientes.BIFE_DE_CHORIZO, 6000);
        Ingrediente pechuga = new Ingrediente(Ingredientes.PECHUGA_DE_POLLO, 3500);
        Ingrediente salmon = new Ingrediente(Ingredientes.SALMON_ROSADO, 9000);
        Ingrediente langostino = new Ingrediente(Ingredientes.LANGOSTINO, 4000);
        Ingrediente calamar = new Ingrediente(Ingredientes.CALAMAR, 2500);

        Ingrediente papa = new Ingrediente(Ingredientes.PAPA_BLANCA, 800);
        Ingrediente tomate = new Ingrediente(Ingredientes.TOMATE_PERITA, 600);
        Ingrediente cebolla = new Ingrediente(Ingredientes.CEBOLLA_MORADA, 500);
        Ingrediente rucula = new Ingrediente(Ingredientes.RUCULA_FRESCA, 700);
        Ingrediente ajo = new Ingrediente(Ingredientes.AJO_BLANCO, 200);
        Ingrediente limon = new Ingrediente(Ingredientes.LIMON_SUTIL, 300);

        Ingrediente quesoMozzarella = new Ingrediente(Ingredientes.QUESO_MOZZARELLA, 1500);
        Ingrediente quesoParmesano = new Ingrediente(Ingredientes.QUESO_PARMESANO, 2000);
        Ingrediente crema = new Ingrediente(Ingredientes.CREMA_DE_LECHE, 1200);
        Ingrediente manteca = new Ingrediente(Ingredientes.MANTECA_SIN_SAL, 900);
        Ingrediente huevo = new Ingrediente(Ingredientes.HUEVO_DE_GALLINA, 400);

        Ingrediente aceiteOliva = new Ingrediente(Ingredientes.ACEITE_DE_OLIVA_VIRGEN, 1000);
        Ingrediente salMarina = new Ingrediente(Ingredientes.SAL_MARINA, 150);
        Ingrediente pimienta = new Ingrediente(Ingredientes.PIMIENTA_NEGRA_GRANO, 200);
        Ingrediente arrozCarnaroli = new Ingrediente(Ingredientes.ARROZ_CARNAROLI, 1800);
        Ingrediente vinoBlanco = new Ingrediente(Ingredientes.VINO_BLANCO_SAUVIGNON, 2500);

        List<UnidadGastronomica> contPapas = new ArrayList<>(Arrays.asList(papa, aceiteOliva, salMarina, pimienta));
        Plato papasRusticas = new Plato(contPapas, "Papas Rústicas al Horno");

        List<UnidadGastronomica> contEnsalada = new ArrayList<>(
                Arrays.asList(rucula, tomate, quesoParmesano, aceiteOliva, limon, salMarina));
        Plato ensaladaFresca = new Plato(contEnsalada, "Ensalada Fresca de Rúcula");

        List<UnidadGastronomica> contCaldo = new ArrayList<>(
                Arrays.asList(calamar, langostino, cebolla, ajo, vinoBlanco));
        Plato caldoMariscos = new Plato(contCaldo, "Caldo de Mariscos al Vino Blanco");

        List<UnidadGastronomica> contBife = new ArrayList<>();
        contBife.add(bifeChorizo);
        contBife.add(huevo);
        contBife.add(huevo); // Doble huevo frito
        contBife.add(salMarina);
        contBife.add(papasRusticas); // ¡Agregamos el Sub-Plato!
        Plato bifeACaballo = new Plato(contBife, "Bife de Chorizo a Caballo con Papas Rústicas");

        List<UnidadGastronomica> contRisotto = new ArrayList<>();
        contRisotto.add(arrozCarnaroli);
        contRisotto.add(manteca);
        contRisotto.add(quesoParmesano);
        contRisotto.add(caldoMariscos); // ¡Agregamos el Sub-Plato!
        Plato risottoMariscos = new Plato(contRisotto, "Risotto Cremoso de Mariscos");

        List<UnidadGastronomica> contPollo = new ArrayList<>();
        contPollo.add(pechuga);
        contPollo.add(limon);
        contPollo.add(pimienta);
        contPollo.add(ensaladaFresca); // ¡Agregamos el Sub-Plato!
        Plato polloGrillado = new Plato(contPollo, "Pechuga Grillada al Limón con Ensalada");

        List<UnidadGastronomica> contSalmon = new ArrayList<>();
        contSalmon.add(salmon);
        contSalmon.add(crema);
        contSalmon.add(cebolla);
        contSalmon.add(vinoBlanco);
        contSalmon.add(papasRusticas); // Reutilizamos la misma guarnición
        Plato salmonCrema = new Plato(contSalmon, "Salmón a la Crema al Sauvignon Blanc");

        cartaMenu.add(bifeACaballo);
        cartaMenu.add(risottoMariscos);
        cartaMenu.add(polloGrillado);
        cartaMenu.add(salmonCrema);

        cartaMenu.add(papasRusticas);
        cartaMenu.add(ensaladaFresca);

        return cartaMenu;
    }
}
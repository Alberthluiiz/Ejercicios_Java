package Poo.pokemon.Logica;

public class Squirtle extends Pokemon implements IAgua {
    //Constructor

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Burbuja");
    }

    @Override
    public void atacarPistolaDeAgua() {
        System.out.println("Hola, Soy Squirtle y este es mi ataje Pistola De Agua");
    }
}


























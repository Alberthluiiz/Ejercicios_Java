package Poo.pokemon.Logica;

public class Charmander extends Pokemon implements IFuego {
    // Constructor

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Puñio de Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, Soy Charmander y este es mi ataje Ascuas");
    }
}























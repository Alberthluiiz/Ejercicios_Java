package Poo.pokemon.Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    //Constructor
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, Soy Bulbasor y este es mi ataje Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, Soy Bulbasor y este es mi ataje Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, Soy Bulbasor y este es mi ataje Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, Soy Bulbasor y este es mi ataje Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, Soy Bulbasor y este es mi ataje Paralizar");
    }
}























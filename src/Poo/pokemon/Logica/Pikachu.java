package Poo.pokemon.Logica;

public class Pikachu extends Pokemon implements IElectrico {
    // Constructores
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, Soy Pikachu y este es mi ataje Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, Soy Pikachu y este es mi ataje Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, Soy Pikachu y este es mi ataje Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, Soy Pikachu y este es mi ataje Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, Soy Pikachu y este es mi ataje Puñio de Trueno");
    }
}


















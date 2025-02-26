package Poo.pokemon.Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        //Creacion de Objetos de Cada Clase Creada
        Squirtle squirtleObj = new Squirtle();
        Charmander charmanderObj = new Charmander();
        Bulbasaur bulbasaurObj = new Bulbasaur();
        Pikachu pikachuObj = new Pikachu();

        squirtleObj.atacarAraniazo();
        squirtleObj.atacarHidrobomba();
        System.out.println("-----");
        charmanderObj.atacarAraniazo();
        charmanderObj.atacarLanzaLlamas();
        System.out.println("-----");
        bulbasaurObj.atacarAraniazo();
        bulbasaurObj.atacarDrenaje();
        System.out.println("-----");
        pikachuObj.atacarAraniazo();
        pikachuObj.atacarImpactrueno();

    }
}






















